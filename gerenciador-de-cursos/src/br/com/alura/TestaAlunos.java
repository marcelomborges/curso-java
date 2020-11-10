package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		System.out.println("-> Tamanho: " + alunos.size());
		boolean adicionouAlberto = alunos.add("Alberto Souza");
		System.out.println("Aluno readicionado com sucesso? " + adicionouAlberto);
		System.out.println("-> Tamanho: " + alunos.size());

		System.out.println("------------------------------------------------");
		
		boolean pauloMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloMatriculado);
		boolean nicoMatriculado = alunos.contains("Nico Steppat");
		System.out.println(nicoMatriculado);		
		
		System.out.println("------------------------------------------------");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("------------------------------------------------");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("------------------------------------------------");
		
		System.out.println(alunos);
		
//		List<String> alunosEmLista = new ArrayList(alunos);
		
	}

}
