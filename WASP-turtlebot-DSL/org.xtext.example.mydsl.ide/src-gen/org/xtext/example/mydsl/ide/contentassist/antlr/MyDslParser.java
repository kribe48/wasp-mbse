/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTaskAccess().getAlternatives(), "rule__Task__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getTurtleBotAccess().getGroup(), "rule__TurtleBot__Group__0");
					put(grammarAccess.getTurtleBotAccess().getGroup_3(), "rule__TurtleBot__Group_3__0");
					put(grammarAccess.getTurtleBotAccess().getGroup_7(), "rule__TurtleBot__Group_7__0");
					put(grammarAccess.getTurtleBotAccess().getGroup_12(), "rule__TurtleBot__Group_12__0");
					put(grammarAccess.getTurtleBotAccess().getGroup_16(), "rule__TurtleBot__Group_16__0");
					put(grammarAccess.getTurtleBotAccess().getGroup_16_3(), "rule__TurtleBot__Group_16_3__0");
					put(grammarAccess.getAreaAccess().getGroup(), "rule__Area__Group__0");
					put(grammarAccess.getWaypointTypeAccess().getGroup(), "rule__WaypointType__Group__0");
					put(grammarAccess.getWayPointAccess().getGroup(), "rule__WayPoint__Group__0");
					put(grammarAccess.getWayPointAccess().getGroup_2(), "rule__WayPoint__Group_2__0");
					put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
					put(grammarAccess.getMissionAccess().getGroup_4(), "rule__Mission__Group_4__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getLineTaskAccess().getGroup(), "rule__LineTask__Group__0");
					put(grammarAccess.getLineTaskAccess().getGroup_3(), "rule__LineTask__Group_3__0");
					put(grammarAccess.getShortestPathTaskAccess().getGroup(), "rule__ShortestPathTask__Group__0");
					put(grammarAccess.getShortestPathTaskAccess().getGroup_3(), "rule__ShortestPathTask__Group_3__0");
					put(grammarAccess.getReturnToStartTaskAccess().getGroup(), "rule__ReturnToStartTask__Group__0");
					put(grammarAccess.getTurtleBotAccess().getNameAssignment_1(), "rule__TurtleBot__NameAssignment_1");
					put(grammarAccess.getTurtleBotAccess().getAreaAssignment_3_1(), "rule__TurtleBot__AreaAssignment_3_1");
					put(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_6(), "rule__TurtleBot__WaypointtypesAssignment_6");
					put(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_7_1(), "rule__TurtleBot__WaypointtypesAssignment_7_1");
					put(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_11(), "rule__TurtleBot__WaypointsAssignment_11");
					put(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_12_1(), "rule__TurtleBot__WaypointsAssignment_12_1");
					put(grammarAccess.getTurtleBotAccess().getBot_startAssignment_15(), "rule__TurtleBot__Bot_startAssignment_15");
					put(grammarAccess.getTurtleBotAccess().getMissionsAssignment_16_2(), "rule__TurtleBot__MissionsAssignment_16_2");
					put(grammarAccess.getTurtleBotAccess().getMissionsAssignment_16_3_1(), "rule__TurtleBot__MissionsAssignment_16_3_1");
					put(grammarAccess.getAreaAccess().getXmaxAssignment_3(), "rule__Area__XmaxAssignment_3");
					put(grammarAccess.getAreaAccess().getYmaxAssignment_6(), "rule__Area__YmaxAssignment_6");
					put(grammarAccess.getWaypointTypeAccess().getNameAssignment_1(), "rule__WaypointType__NameAssignment_1");
					put(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_1(), "rule__WayPoint__WaypointtypesAssignment_1");
					put(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_2_1(), "rule__WayPoint__WaypointtypesAssignment_2_1");
					put(grammarAccess.getWayPointAccess().getNameAssignment_3(), "rule__WayPoint__NameAssignment_3");
					put(grammarAccess.getWayPointAccess().getCoord_xAssignment_6(), "rule__WayPoint__Coord_xAssignment_6");
					put(grammarAccess.getWayPointAccess().getCoord_yAssignment_9(), "rule__WayPoint__Coord_yAssignment_9");
					put(grammarAccess.getMissionAccess().getNameAssignment_1(), "rule__Mission__NameAssignment_1");
					put(grammarAccess.getMissionAccess().getTaskAssignment_3(), "rule__Mission__TaskAssignment_3");
					put(grammarAccess.getMissionAccess().getTaskAssignment_4_1(), "rule__Mission__TaskAssignment_4_1");
					put(grammarAccess.getLineTaskAccess().getWaypointsAssignment_2(), "rule__LineTask__WaypointsAssignment_2");
					put(grammarAccess.getLineTaskAccess().getWaypointsAssignment_3_1(), "rule__LineTask__WaypointsAssignment_3_1");
					put(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_2(), "rule__ShortestPathTask__WaypointsAssignment_2");
					put(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_3_1(), "rule__ShortestPathTask__WaypointsAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleTurtleBot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
