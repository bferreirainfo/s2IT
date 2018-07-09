package com.S2Test.numeros;

public class Concatenador {
	private String numberoA;
	private String numberoB;

	public Concatenador(String numberA, String numberB) {
		this.numberoA = numberA;
		this.numberoB = numberB;
	}

	public Integer merge() {
		StringBuilder resultado = new StringBuilder();
		boolean isAMaiorIgualB = numberoA.length() >= numberoB.length();
		String numeroMaior = isAMaiorIgualB ? numberoA : numberoB;
		for(int index = 0; index < numeroMaior.length(); index++) {
			if(index < numberoA.length()) resultado.append(numberoA.charAt(index));
			if(index < numberoB.length()) resultado.append(numberoB.charAt(index));
		}
		Integer resultaAsInteger = Integer.valueOf(resultado.toString());
		if(resultaAsInteger > 1000000) return -1;
		else return resultaAsInteger;
	}

}
