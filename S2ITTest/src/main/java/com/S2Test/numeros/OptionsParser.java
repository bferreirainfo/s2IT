package com.S2Test.numeros;

import java.util.HashMap;
import java.util.Map;
/**
 * Parse command line arguments divided by the occurrence of "=" <br>
 * For instance, this command line: <br> 
 * java -jar thisjar.jar A:123 B:456<br> 
 * Will result in this:<br> 
 * {"A", "123"} <br>
 * {"B", "456"} <br>
 * @param commandline args
 * @author bruno.ferreira.silva
 */
public class OptionsParser {
	Map<String, String> commandLineArguments;

	public OptionsParser(String[] args) {
		this.commandLineArguments = parseArgsToHashMap(args);
	}

	private Map<String, String> parseArgsToHashMap(String[] args) {
		Map<String, String> argsMap = new HashMap<>();
		for (String arg : args) {
			String[] keyValue = arg.split("=", 2);
			argsMap.put(keyValue[0], keyValue[1]);
		}
		return argsMap;
	}

	public String get(String key) {
		return get(key, null);

	}
	
	public String get(String key, String notFoundExceptionMessage) {
		String value = commandLineArguments.get(key);
		if (notFoundExceptionMessage != null && value == null) {
			throw new IllegalArgumentException(notFoundExceptionMessage);
		}
		return value;

	}
}
