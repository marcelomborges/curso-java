package br.com.alura;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExercicioMap {

	public static void main(String[] args) {
		
		//Map<Integer, String> pessoas = new HashMap<>();
		Map<Integer, String> pessoas = new LinkedHashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");

		for (Integer idade : pessoas.keySet()) {
			System.out.println(pessoas.get(idade));
		}

	}

}
