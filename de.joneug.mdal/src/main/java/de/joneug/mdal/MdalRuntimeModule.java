/*
 * generated by Xtext 2.21.0
 */
package de.joneug.mdal;

import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.parser.IParser;

import de.joneug.mdal.generator.MdalGenerator;
import de.joneug.mdal.parser.antlr.MdalParser;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class MdalRuntimeModule extends AbstractMdalRuntimeModule {
	
	public Class<? extends IParser> bindIParser() {
		return MdalParser.class;
	}
	
	public Class<? extends IGenerator2> bindIGenerator2() {
		return MdalGenerator.class;
	}
	
}
