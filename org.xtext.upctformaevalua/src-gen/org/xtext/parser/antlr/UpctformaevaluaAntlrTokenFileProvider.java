/*
 * generated by Xtext 2.17.1
 */
package org.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UpctformaevaluaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/parser/antlr/internal/InternalUpctformaevalua.tokens");
	}
}