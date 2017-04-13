package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TurtleBot'", "'{'", "'area ='", "'waypoint types ='", "','", "'}'", "'waypoints ='", "'bot starts at ='", "'missions ='", "'('", "'max x ='", "'max y ='", "')'", "'&'", "'x='", "'y='", "'-'", "'line'", "'shortest path'", "'return to start'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TurtleBot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTurtleBot"
    // InternalMyDsl.g:64:1: entryRuleTurtleBot returns [EObject current=null] : iv_ruleTurtleBot= ruleTurtleBot EOF ;
    public final EObject entryRuleTurtleBot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurtleBot = null;


        try {
            // InternalMyDsl.g:64:50: (iv_ruleTurtleBot= ruleTurtleBot EOF )
            // InternalMyDsl.g:65:2: iv_ruleTurtleBot= ruleTurtleBot EOF
            {
             newCompositeNode(grammarAccess.getTurtleBotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurtleBot=ruleTurtleBot();

            state._fsp--;

             current =iv_ruleTurtleBot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurtleBot"


    // $ANTLR start "ruleTurtleBot"
    // InternalMyDsl.g:71:1: ruleTurtleBot returns [EObject current=null] : (otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'area =' ( (lv_area_4_0= ruleArea ) ) )? otherlv_5= 'waypoint types =' otherlv_6= '{' ( (lv_waypointtypes_7_0= ruleWaypointType ) ) (otherlv_8= ',' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) )* otherlv_10= '}' otherlv_11= 'waypoints =' otherlv_12= '{' ( (lv_waypoints_13_0= ruleWayPoint ) ) (otherlv_14= ',' ( (lv_waypoints_15_0= ruleWayPoint ) ) )* otherlv_16= '}' otherlv_17= 'bot starts at =' ( ( ruleEString ) ) (otherlv_19= 'missions =' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleTurtleBot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_area_4_0 = null;

        EObject lv_waypointtypes_7_0 = null;

        EObject lv_waypointtypes_9_0 = null;

        EObject lv_waypoints_13_0 = null;

        EObject lv_waypoints_15_0 = null;

        EObject lv_missions_21_0 = null;

        EObject lv_missions_23_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'area =' ( (lv_area_4_0= ruleArea ) ) )? otherlv_5= 'waypoint types =' otherlv_6= '{' ( (lv_waypointtypes_7_0= ruleWaypointType ) ) (otherlv_8= ',' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) )* otherlv_10= '}' otherlv_11= 'waypoints =' otherlv_12= '{' ( (lv_waypoints_13_0= ruleWayPoint ) ) (otherlv_14= ',' ( (lv_waypoints_15_0= ruleWayPoint ) ) )* otherlv_16= '}' otherlv_17= 'bot starts at =' ( ( ruleEString ) ) (otherlv_19= 'missions =' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'area =' ( (lv_area_4_0= ruleArea ) ) )? otherlv_5= 'waypoint types =' otherlv_6= '{' ( (lv_waypointtypes_7_0= ruleWaypointType ) ) (otherlv_8= ',' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) )* otherlv_10= '}' otherlv_11= 'waypoints =' otherlv_12= '{' ( (lv_waypoints_13_0= ruleWayPoint ) ) (otherlv_14= ',' ( (lv_waypoints_15_0= ruleWayPoint ) ) )* otherlv_16= '}' otherlv_17= 'bot starts at =' ( ( ruleEString ) ) (otherlv_19= 'missions =' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'area =' ( (lv_area_4_0= ruleArea ) ) )? otherlv_5= 'waypoint types =' otherlv_6= '{' ( (lv_waypointtypes_7_0= ruleWaypointType ) ) (otherlv_8= ',' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) )* otherlv_10= '}' otherlv_11= 'waypoints =' otherlv_12= '{' ( (lv_waypoints_13_0= ruleWayPoint ) ) (otherlv_14= ',' ( (lv_waypoints_15_0= ruleWayPoint ) ) )* otherlv_16= '}' otherlv_17= 'bot starts at =' ( ( ruleEString ) ) (otherlv_19= 'missions =' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'area =' ( (lv_area_4_0= ruleArea ) ) )? otherlv_5= 'waypoint types =' otherlv_6= '{' ( (lv_waypointtypes_7_0= ruleWaypointType ) ) (otherlv_8= ',' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) )* otherlv_10= '}' otherlv_11= 'waypoints =' otherlv_12= '{' ( (lv_waypoints_13_0= ruleWayPoint ) ) (otherlv_14= ',' ( (lv_waypoints_15_0= ruleWayPoint ) ) )* otherlv_16= '}' otherlv_17= 'bot starts at =' ( ( ruleEString ) ) (otherlv_19= 'missions =' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTurtleBotAccess().getTurtleBotKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:106:3: (otherlv_3= 'area =' ( (lv_area_4_0= ruleArea ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:107:4: otherlv_3= 'area =' ( (lv_area_4_0= ruleArea ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getTurtleBotAccess().getAreaKeyword_3_0());
                    			
                    // InternalMyDsl.g:111:4: ( (lv_area_4_0= ruleArea ) )
                    // InternalMyDsl.g:112:5: (lv_area_4_0= ruleArea )
                    {
                    // InternalMyDsl.g:112:5: (lv_area_4_0= ruleArea )
                    // InternalMyDsl.g:113:6: lv_area_4_0= ruleArea
                    {

                    						newCompositeNode(grammarAccess.getTurtleBotAccess().getAreaAreaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_area_4_0=ruleArea();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTurtleBotRule());
                    						}
                    						set(
                    							current,
                    							"area",
                    							lv_area_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Area");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getTurtleBotAccess().getWaypointTypesKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:139:3: ( (lv_waypointtypes_7_0= ruleWaypointType ) )
            // InternalMyDsl.g:140:4: (lv_waypointtypes_7_0= ruleWaypointType )
            {
            // InternalMyDsl.g:140:4: (lv_waypointtypes_7_0= ruleWaypointType )
            // InternalMyDsl.g:141:5: lv_waypointtypes_7_0= ruleWaypointType
            {

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_waypointtypes_7_0=ruleWaypointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            					}
            					add(
            						current,
            						"waypointtypes",
            						lv_waypointtypes_7_0,
            						"org.xtext.example.mydsl.MyDsl.WaypointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:158:3: (otherlv_8= ',' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:159:4: otherlv_8= ',' ( (lv_waypointtypes_9_0= ruleWaypointType ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getTurtleBotAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:163:4: ( (lv_waypointtypes_9_0= ruleWaypointType ) )
            	    // InternalMyDsl.g:164:5: (lv_waypointtypes_9_0= ruleWaypointType )
            	    {
            	    // InternalMyDsl.g:164:5: (lv_waypointtypes_9_0= ruleWaypointType )
            	    // InternalMyDsl.g:165:6: lv_waypointtypes_9_0= ruleWaypointType
            	    {

            	    						newCompositeNode(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_waypointtypes_9_0=ruleWaypointType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"waypointtypes",
            	    							lv_waypointtypes_9_0,
            	    							"org.xtext.example.mydsl.MyDsl.WaypointType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getTurtleBotAccess().getWaypointsKeyword_9());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:195:3: ( (lv_waypoints_13_0= ruleWayPoint ) )
            // InternalMyDsl.g:196:4: (lv_waypoints_13_0= ruleWayPoint )
            {
            // InternalMyDsl.g:196:4: (lv_waypoints_13_0= ruleWayPoint )
            // InternalMyDsl.g:197:5: lv_waypoints_13_0= ruleWayPoint
            {

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_waypoints_13_0=ruleWayPoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            					}
            					add(
            						current,
            						"waypoints",
            						lv_waypoints_13_0,
            						"org.xtext.example.mydsl.MyDsl.WayPoint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:214:3: (otherlv_14= ',' ( (lv_waypoints_15_0= ruleWayPoint ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:215:4: otherlv_14= ',' ( (lv_waypoints_15_0= ruleWayPoint ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_14, grammarAccess.getTurtleBotAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:219:4: ( (lv_waypoints_15_0= ruleWayPoint ) )
            	    // InternalMyDsl.g:220:5: (lv_waypoints_15_0= ruleWayPoint )
            	    {
            	    // InternalMyDsl.g:220:5: (lv_waypoints_15_0= ruleWayPoint )
            	    // InternalMyDsl.g:221:6: lv_waypoints_15_0= ruleWayPoint
            	    {

            	    						newCompositeNode(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_waypoints_15_0=ruleWayPoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"waypoints",
            	    							lv_waypoints_15_0,
            	    							"org.xtext.example.mydsl.MyDsl.WayPoint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_17=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getTurtleBotAccess().getBotStartsAtKeyword_14());
            		
            // InternalMyDsl.g:247:3: ( ( ruleEString ) )
            // InternalMyDsl.g:248:4: ( ruleEString )
            {
            // InternalMyDsl.g:248:4: ( ruleEString )
            // InternalMyDsl.g:249:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurtleBotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getBot_startWayPointCrossReference_15_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:263:3: (otherlv_19= 'missions =' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:264:4: otherlv_19= 'missions =' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getTurtleBotAccess().getMissionsKeyword_16_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalMyDsl.g:272:4: ( (lv_missions_21_0= ruleMission ) )
                    // InternalMyDsl.g:273:5: (lv_missions_21_0= ruleMission )
                    {
                    // InternalMyDsl.g:273:5: (lv_missions_21_0= ruleMission )
                    // InternalMyDsl.g:274:6: lv_missions_21_0= ruleMission
                    {

                    						newCompositeNode(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_missions_21_0=ruleMission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTurtleBotRule());
                    						}
                    						add(
                    							current,
                    							"missions",
                    							lv_missions_21_0,
                    							"org.xtext.example.mydsl.MyDsl.Mission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:291:4: (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:292:5: otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getTurtleBotAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalMyDsl.g:296:5: ( (lv_missions_23_0= ruleMission ) )
                    	    // InternalMyDsl.g:297:6: (lv_missions_23_0= ruleMission )
                    	    {
                    	    // InternalMyDsl.g:297:6: (lv_missions_23_0= ruleMission )
                    	    // InternalMyDsl.g:298:7: lv_missions_23_0= ruleMission
                    	    {

                    	    							newCompositeNode(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_missions_23_0=ruleMission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTurtleBotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"missions",
                    	    								lv_missions_23_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Mission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_24, grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurtleBot"


    // $ANTLR start "entryRuleTask"
    // InternalMyDsl.g:329:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalMyDsl.g:329:45: (iv_ruleTask= ruleTask EOF )
            // InternalMyDsl.g:330:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalMyDsl.g:336:1: ruleTask returns [EObject current=null] : (this_LineTask_0= ruleLineTask | this_ShortestPathTask_1= ruleShortestPathTask | this_ReturnToStartTask_2= ruleReturnToStartTask ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_LineTask_0 = null;

        EObject this_ShortestPathTask_1 = null;

        EObject this_ReturnToStartTask_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:342:2: ( (this_LineTask_0= ruleLineTask | this_ShortestPathTask_1= ruleShortestPathTask | this_ReturnToStartTask_2= ruleReturnToStartTask ) )
            // InternalMyDsl.g:343:2: (this_LineTask_0= ruleLineTask | this_ShortestPathTask_1= ruleShortestPathTask | this_ReturnToStartTask_2= ruleReturnToStartTask )
            {
            // InternalMyDsl.g:343:2: (this_LineTask_0= ruleLineTask | this_ShortestPathTask_1= ruleShortestPathTask | this_ReturnToStartTask_2= ruleReturnToStartTask )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:344:3: this_LineTask_0= ruleLineTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getLineTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineTask_0=ruleLineTask();

                    state._fsp--;


                    			current = this_LineTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:353:3: this_ShortestPathTask_1= ruleShortestPathTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getShortestPathTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShortestPathTask_1=ruleShortestPathTask();

                    state._fsp--;


                    			current = this_ShortestPathTask_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:362:3: this_ReturnToStartTask_2= ruleReturnToStartTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getReturnToStartTaskParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReturnToStartTask_2=ruleReturnToStartTask();

                    state._fsp--;


                    			current = this_ReturnToStartTask_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:374:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:374:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:375:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:381:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:387:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:388:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:388:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:389:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:397:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleArea"
    // InternalMyDsl.g:408:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalMyDsl.g:408:45: (iv_ruleArea= ruleArea EOF )
            // InternalMyDsl.g:409:2: iv_ruleArea= ruleArea EOF
            {
             newCompositeNode(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArea=ruleArea();

            state._fsp--;

             current =iv_ruleArea; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalMyDsl.g:415:1: ruleArea returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'max x =' ( (lv_xmax_3_0= ruleEInt ) ) otherlv_4= ',' otherlv_5= 'max y =' ( (lv_ymax_6_0= ruleEInt ) ) otherlv_7= ')' ) ;
    public final EObject ruleArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_xmax_3_0 = null;

        AntlrDatatypeRuleToken lv_ymax_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:421:2: ( ( () otherlv_1= '(' otherlv_2= 'max x =' ( (lv_xmax_3_0= ruleEInt ) ) otherlv_4= ',' otherlv_5= 'max y =' ( (lv_ymax_6_0= ruleEInt ) ) otherlv_7= ')' ) )
            // InternalMyDsl.g:422:2: ( () otherlv_1= '(' otherlv_2= 'max x =' ( (lv_xmax_3_0= ruleEInt ) ) otherlv_4= ',' otherlv_5= 'max y =' ( (lv_ymax_6_0= ruleEInt ) ) otherlv_7= ')' )
            {
            // InternalMyDsl.g:422:2: ( () otherlv_1= '(' otherlv_2= 'max x =' ( (lv_xmax_3_0= ruleEInt ) ) otherlv_4= ',' otherlv_5= 'max y =' ( (lv_ymax_6_0= ruleEInt ) ) otherlv_7= ')' )
            // InternalMyDsl.g:423:3: () otherlv_1= '(' otherlv_2= 'max x =' ( (lv_xmax_3_0= ruleEInt ) ) otherlv_4= ',' otherlv_5= 'max y =' ( (lv_ymax_6_0= ruleEInt ) ) otherlv_7= ')'
            {
            // InternalMyDsl.g:423:3: ()
            // InternalMyDsl.g:424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAreaAccess().getAreaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAreaAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getMaxXKeyword_2());
            		
            // InternalMyDsl.g:438:3: ( (lv_xmax_3_0= ruleEInt ) )
            // InternalMyDsl.g:439:4: (lv_xmax_3_0= ruleEInt )
            {
            // InternalMyDsl.g:439:4: (lv_xmax_3_0= ruleEInt )
            // InternalMyDsl.g:440:5: lv_xmax_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getXmaxEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_xmax_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAreaRule());
            					}
            					set(
            						current,
            						"xmax",
            						lv_xmax_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getAreaAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getAreaAccess().getMaxYKeyword_5());
            		
            // InternalMyDsl.g:465:3: ( (lv_ymax_6_0= ruleEInt ) )
            // InternalMyDsl.g:466:4: (lv_ymax_6_0= ruleEInt )
            {
            // InternalMyDsl.g:466:4: (lv_ymax_6_0= ruleEInt )
            // InternalMyDsl.g:467:5: lv_ymax_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getYmaxEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_ymax_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAreaRule());
            					}
            					set(
            						current,
            						"ymax",
            						lv_ymax_6_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAreaAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleWaypointType"
    // InternalMyDsl.g:492:1: entryRuleWaypointType returns [EObject current=null] : iv_ruleWaypointType= ruleWaypointType EOF ;
    public final EObject entryRuleWaypointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaypointType = null;


        try {
            // InternalMyDsl.g:492:53: (iv_ruleWaypointType= ruleWaypointType EOF )
            // InternalMyDsl.g:493:2: iv_ruleWaypointType= ruleWaypointType EOF
            {
             newCompositeNode(grammarAccess.getWaypointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaypointType=ruleWaypointType();

            state._fsp--;

             current =iv_ruleWaypointType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWaypointType"


    // $ANTLR start "ruleWaypointType"
    // InternalMyDsl.g:499:1: ruleWaypointType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleWaypointType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:505:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:506:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:506:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:507:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:507:3: ()
            // InternalMyDsl.g:508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaypointTypeAccess().getWaypointTypeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:514:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:515:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:515:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:516:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWaypointTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaypointTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWaypointType"


    // $ANTLR start "entryRuleWayPoint"
    // InternalMyDsl.g:537:1: entryRuleWayPoint returns [EObject current=null] : iv_ruleWayPoint= ruleWayPoint EOF ;
    public final EObject entryRuleWayPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWayPoint = null;


        try {
            // InternalMyDsl.g:537:49: (iv_ruleWayPoint= ruleWayPoint EOF )
            // InternalMyDsl.g:538:2: iv_ruleWayPoint= ruleWayPoint EOF
            {
             newCompositeNode(grammarAccess.getWayPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWayPoint=ruleWayPoint();

            state._fsp--;

             current =iv_ruleWayPoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWayPoint"


    // $ANTLR start "ruleWayPoint"
    // InternalMyDsl.g:544:1: ruleWayPoint returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= '&' ( ( ruleEString ) ) )* ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'x=' ( (lv_coord_x_7_0= ruleEInt ) ) otherlv_8= ',' otherlv_9= 'y=' ( (lv_coord_y_10_0= ruleEInt ) ) otherlv_11= ')' ) ;
    public final EObject ruleWayPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_coord_x_7_0 = null;

        AntlrDatatypeRuleToken lv_coord_y_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:550:2: ( ( () ( ( ruleEString ) ) (otherlv_2= '&' ( ( ruleEString ) ) )* ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'x=' ( (lv_coord_x_7_0= ruleEInt ) ) otherlv_8= ',' otherlv_9= 'y=' ( (lv_coord_y_10_0= ruleEInt ) ) otherlv_11= ')' ) )
            // InternalMyDsl.g:551:2: ( () ( ( ruleEString ) ) (otherlv_2= '&' ( ( ruleEString ) ) )* ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'x=' ( (lv_coord_x_7_0= ruleEInt ) ) otherlv_8= ',' otherlv_9= 'y=' ( (lv_coord_y_10_0= ruleEInt ) ) otherlv_11= ')' )
            {
            // InternalMyDsl.g:551:2: ( () ( ( ruleEString ) ) (otherlv_2= '&' ( ( ruleEString ) ) )* ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'x=' ( (lv_coord_x_7_0= ruleEInt ) ) otherlv_8= ',' otherlv_9= 'y=' ( (lv_coord_y_10_0= ruleEInt ) ) otherlv_11= ')' )
            // InternalMyDsl.g:552:3: () ( ( ruleEString ) ) (otherlv_2= '&' ( ( ruleEString ) ) )* ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'x=' ( (lv_coord_x_7_0= ruleEInt ) ) otherlv_8= ',' otherlv_9= 'y=' ( (lv_coord_y_10_0= ruleEInt ) ) otherlv_11= ')'
            {
            // InternalMyDsl.g:552:3: ()
            // InternalMyDsl.g:553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWayPointAccess().getWayPointAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:559:3: ( ( ruleEString ) )
            // InternalMyDsl.g:560:4: ( ruleEString )
            {
            // InternalMyDsl.g:560:4: ( ruleEString )
            // InternalMyDsl.g:561:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWayPointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:575:3: (otherlv_2= '&' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:576:4: otherlv_2= '&' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWayPointAccess().getAmpersandKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:580:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:581:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:581:5: ( ruleEString )
            	    // InternalMyDsl.g:582:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getWayPointRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:597:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:598:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:598:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:599:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWayPointAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWayPointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getWayPointAccess().getLeftParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getWayPointAccess().getXKeyword_5());
            		
            // InternalMyDsl.g:624:3: ( (lv_coord_x_7_0= ruleEInt ) )
            // InternalMyDsl.g:625:4: (lv_coord_x_7_0= ruleEInt )
            {
            // InternalMyDsl.g:625:4: (lv_coord_x_7_0= ruleEInt )
            // InternalMyDsl.g:626:5: lv_coord_x_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getWayPointAccess().getCoord_xEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_coord_x_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWayPointRule());
            					}
            					set(
            						current,
            						"coord_x",
            						lv_coord_x_7_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getWayPointAccess().getCommaKeyword_7());
            		
            otherlv_9=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getWayPointAccess().getYKeyword_8());
            		
            // InternalMyDsl.g:651:3: ( (lv_coord_y_10_0= ruleEInt ) )
            // InternalMyDsl.g:652:4: (lv_coord_y_10_0= ruleEInt )
            {
            // InternalMyDsl.g:652:4: (lv_coord_y_10_0= ruleEInt )
            // InternalMyDsl.g:653:5: lv_coord_y_10_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getWayPointAccess().getCoord_yEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_17);
            lv_coord_y_10_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWayPointRule());
            					}
            					set(
            						current,
            						"coord_y",
            						lv_coord_y_10_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getWayPointAccess().getRightParenthesisKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWayPoint"


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:678:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:678:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:679:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalMyDsl.g:685:1: ruleMission returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_task_3_0= ruleTask ) ) (otherlv_4= ',' ( (lv_task_5_0= ruleTask ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_task_3_0 = null;

        EObject lv_task_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:691:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_task_3_0= ruleTask ) ) (otherlv_4= ',' ( (lv_task_5_0= ruleTask ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:692:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_task_3_0= ruleTask ) ) (otherlv_4= ',' ( (lv_task_5_0= ruleTask ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:692:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_task_3_0= ruleTask ) ) (otherlv_4= ',' ( (lv_task_5_0= ruleTask ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:693:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_task_3_0= ruleTask ) ) (otherlv_4= ',' ( (lv_task_5_0= ruleTask ) ) )* otherlv_6= '}'
            {
            // InternalMyDsl.g:693:3: ()
            // InternalMyDsl.g:694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMissionAccess().getMissionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:700:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:701:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:701:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:702:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:723:3: ( (lv_task_3_0= ruleTask ) )
            // InternalMyDsl.g:724:4: (lv_task_3_0= ruleTask )
            {
            // InternalMyDsl.g:724:4: (lv_task_3_0= ruleTask )
            // InternalMyDsl.g:725:5: lv_task_3_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_task_3_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"task",
            						lv_task_3_0,
            						"org.xtext.example.mydsl.MyDsl.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:742:3: (otherlv_4= ',' ( (lv_task_5_0= ruleTask ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:743:4: otherlv_4= ',' ( (lv_task_5_0= ruleTask ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:747:4: ( (lv_task_5_0= ruleTask ) )
            	    // InternalMyDsl.g:748:5: (lv_task_5_0= ruleTask )
            	    {
            	    // InternalMyDsl.g:748:5: (lv_task_5_0= ruleTask )
            	    // InternalMyDsl.g:749:6: lv_task_5_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_task_5_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"task",
            	    							lv_task_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:775:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:775:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:776:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:782:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:788:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:789:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:789:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:790:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:790:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:791:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleLineTask"
    // InternalMyDsl.g:808:1: entryRuleLineTask returns [EObject current=null] : iv_ruleLineTask= ruleLineTask EOF ;
    public final EObject entryRuleLineTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineTask = null;


        try {
            // InternalMyDsl.g:808:49: (iv_ruleLineTask= ruleLineTask EOF )
            // InternalMyDsl.g:809:2: iv_ruleLineTask= ruleLineTask EOF
            {
             newCompositeNode(grammarAccess.getLineTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineTask=ruleLineTask();

            state._fsp--;

             current =iv_ruleLineTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineTask"


    // $ANTLR start "ruleLineTask"
    // InternalMyDsl.g:815:1: ruleLineTask returns [EObject current=null] : (otherlv_0= 'line' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleLineTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:821:2: ( (otherlv_0= 'line' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            // InternalMyDsl.g:822:2: (otherlv_0= 'line' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            {
            // InternalMyDsl.g:822:2: (otherlv_0= 'line' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            // InternalMyDsl.g:823:3: otherlv_0= 'line' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLineTaskAccess().getLineKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLineTaskAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:831:3: ( ( ruleEString ) )
            // InternalMyDsl.g:832:4: ( ruleEString )
            {
            // InternalMyDsl.g:832:4: ( ruleEString )
            // InternalMyDsl.g:833:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineTaskRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_2_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:847:3: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:848:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLineTaskAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:852:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:853:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:853:5: ( ruleEString )
            	    // InternalMyDsl.g:854:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLineTaskRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLineTaskAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineTask"


    // $ANTLR start "entryRuleShortestPathTask"
    // InternalMyDsl.g:877:1: entryRuleShortestPathTask returns [EObject current=null] : iv_ruleShortestPathTask= ruleShortestPathTask EOF ;
    public final EObject entryRuleShortestPathTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortestPathTask = null;


        try {
            // InternalMyDsl.g:877:57: (iv_ruleShortestPathTask= ruleShortestPathTask EOF )
            // InternalMyDsl.g:878:2: iv_ruleShortestPathTask= ruleShortestPathTask EOF
            {
             newCompositeNode(grammarAccess.getShortestPathTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShortestPathTask=ruleShortestPathTask();

            state._fsp--;

             current =iv_ruleShortestPathTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShortestPathTask"


    // $ANTLR start "ruleShortestPathTask"
    // InternalMyDsl.g:884:1: ruleShortestPathTask returns [EObject current=null] : (otherlv_0= 'shortest path' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleShortestPathTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:890:2: ( (otherlv_0= 'shortest path' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            // InternalMyDsl.g:891:2: (otherlv_0= 'shortest path' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            {
            // InternalMyDsl.g:891:2: (otherlv_0= 'shortest path' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            // InternalMyDsl.g:892:3: otherlv_0= 'shortest path' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShortestPathTaskAccess().getShortestPathKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getShortestPathTaskAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:900:3: ( ( ruleEString ) )
            // InternalMyDsl.g:901:4: ( ruleEString )
            {
            // InternalMyDsl.g:901:4: ( ruleEString )
            // InternalMyDsl.g:902:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShortestPathTaskRule());
            					}
            				

            					newCompositeNode(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_2_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:916:3: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:917:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getShortestPathTaskAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:921:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:922:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:922:5: ( ruleEString )
            	    // InternalMyDsl.g:923:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getShortestPathTaskRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getShortestPathTaskAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShortestPathTask"


    // $ANTLR start "entryRuleReturnToStartTask"
    // InternalMyDsl.g:946:1: entryRuleReturnToStartTask returns [EObject current=null] : iv_ruleReturnToStartTask= ruleReturnToStartTask EOF ;
    public final EObject entryRuleReturnToStartTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnToStartTask = null;


        try {
            // InternalMyDsl.g:946:58: (iv_ruleReturnToStartTask= ruleReturnToStartTask EOF )
            // InternalMyDsl.g:947:2: iv_ruleReturnToStartTask= ruleReturnToStartTask EOF
            {
             newCompositeNode(grammarAccess.getReturnToStartTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnToStartTask=ruleReturnToStartTask();

            state._fsp--;

             current =iv_ruleReturnToStartTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnToStartTask"


    // $ANTLR start "ruleReturnToStartTask"
    // InternalMyDsl.g:953:1: ruleReturnToStartTask returns [EObject current=null] : ( () otherlv_1= 'return to start' ) ;
    public final EObject ruleReturnToStartTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:959:2: ( ( () otherlv_1= 'return to start' ) )
            // InternalMyDsl.g:960:2: ( () otherlv_1= 'return to start' )
            {
            // InternalMyDsl.g:960:2: ( () otherlv_1= 'return to start' )
            // InternalMyDsl.g:961:3: () otherlv_1= 'return to start'
            {
            // InternalMyDsl.g:961:3: ()
            // InternalMyDsl.g:962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnToStartTaskAccess().getReturnToStartKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnToStartTask"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000808000L});

}