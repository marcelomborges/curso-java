package br.com.bytebank.banco.test.util;

import java.util.*;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //Autoboxing
		System.out.println(idadeRef.doubleValue()); //Unboxing
		
		Double dRef = Double.valueOf(3.2); //Autoboxing
		System.out.println(dRef.doubleValue()); //Unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Double.valueOf(29.9f);
		System.out.println(refNumero.floatValue());

		List<Number> lista = new ArrayList<Number>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
	}

}
