#!/usr/bin/env python
import rospy
from geometry_msgs.msg  import Twist
from turtlesim.msg import Pose
from math import pow,atan2,sqrt
import numpy as np

class turtle():
    def __init__(self):
        #Creating our node,publisher and subscriber
        rospy.init_node('turtlebot_controller', anonymous=True)
        self.velocity_publisher = rospy.Publisher('/turtle1/cmd_vel', Twist, queue_size=10)
        self.pose_subscriber = rospy.Subscriber('/turtle1/pose', Pose, self.callback)
        self.pose = Pose()
        self.rate = rospy.Rate(10)
	#This is the tolerance of the controller, because the turtlesim is not the most accurate simulator
	self.tolerance = 0.1

    #Callback function implementing the pose value received
    #This saves the current position of the turtle in global coordinate system
    def callback(self, data):
        self.pose = data
        self.pose.x = round(self.pose.x, 4)
        self.pose.y = round(self.pose.y, 4)

    #Distance to the actual goal
    def get_distance(self, goal_x, goal_y):
        distance = sqrt(pow((goal_x - self.pose.x), 2) + pow((goal_y - self.pose.y), 2))
        return distance

    #This function drives the correct behavior of the robot in the turtle sim map
    def move2goal(self,posX,posY):
        goal_pose = Pose()
        goal_pose.x = posX
        goal_pose.y = posY
        distance_tolerance = self.tolerance
        vel_msg = Twist()
        while sqrt(pow((goal_pose.x - self.pose.x), 2) + pow((goal_pose.y - self.pose.y), 2)) >= distance_tolerance:
            #Porportional Controller
            #linear velocity in the x-axis:
            vel_msg.linear.x = 1.5 * sqrt(pow((goal_pose.x - self.pose.x), 2) + pow((goal_pose.y - self.pose.y), 2))
            vel_msg.linear.y = 0
            vel_msg.linear.z = 0

            #angular velocity in the z-axis:
            vel_msg.angular.x = 0
            vel_msg.angular.y = 0
            vel_msg.angular.z = 4 * (atan2(goal_pose.y - self.pose.y, goal_pose.x - self.pose.x) - self.pose.theta)

            #Publishing our vel_msg
            self.velocity_publisher.publish(vel_msg)
            self.rate.sleep()
        #Stopping our robot after the movement is over
        vel_msg.linear.x = 0
        vel_msg.angular.z =0
        self.velocity_publisher.publish(vel_msg)

def create_list_from_mission_plan(mission_plan):
    coordinates = []
    for mission in mission_plan :
        currTask = mission[0]
        currWayPoints = mission[1]
        if currTask is 'SHORTESTPATH' :
            currWayPoints = currWayPoints
        for wp in currWayPoints :
            coordinates.append(wp)

    return coordinates

if __name__ == '__main__':
    try:
	#creating a turtle object
        tb = turtle()
	#list of coordinates to visit
	#This can is the only thing to change in the model to text
        mission = [['LINE',[(1,1),(1,2),(3,3),(6,6),(10,10),(1,1)]], ['LINE',[(1,1),(1,2),(3,3),(6,6),(10,10),(1,1)]] ]
        coordinate_list = create_list_from_mission_plan(mission)
	#making the the turtle follow the coordinates in sequence
        for coordinate in coordinate_list:
           x,y = coordinate
           tb.move2goal(x,y)

    except rospy.ROSInterruptException: pass
