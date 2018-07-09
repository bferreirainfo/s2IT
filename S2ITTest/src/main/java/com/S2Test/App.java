package com.S2Test;

import com.S2Test.numeros.Concatenador;
import com.S2Test.numeros.OptionsParser;

public class App {
	private String[] args;

	public App(String[] args) throws Exception{
		this.args = args;
	}
	
	public Integer merge() throws Exception{
		OptionsParser options = new OptionsParser(args);
		return new Concatenador(options.get("A"),options.get("B")).merge();
	}
	
	public static void main( String[] args ) throws Exception{
		new App(args).merge();
    }
	
}
