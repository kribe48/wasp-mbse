/*
 * generated by Xtext 2.10.0
 */
package se.chalmers.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TurtleBotMissionDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("se/chalmers/parser/antlr/internal/InternalTurtleBotMissionDSL.tokens");
	}
}
