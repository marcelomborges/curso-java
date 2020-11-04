package br.com.bytebank.banco.test.util;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
//		int[] idades = new int[5];
//		String[] nomes = new String[5];
		
//		int idade = 29;
		
		//Integer idadeRef = new Integer(29);
		Integer idadeRef = Integer.valueOf(29); //Autoboxing
		int valor = idadeRef.intValue(); //Unboxing
		
		System.out.println(valor);
		System.out.println(idadeRef.doubleValue());
		
		String s = args[0];//"666"
		//Integer value = Integer.valueOf(s);
		Integer value = Integer.parseInt(s); //Parse Int
		System.out.println(value);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//Autoboxing
	}

}
