package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções",24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 12414);
		Aluno a3 = new Aluno("Mauricio Aniche", 54234);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("-> Alunos Matriculados:");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
//		javaColecoes.getAlunos().forEach(aluno -> System.out.println("Aluno:" + aluno));
		
//		javaColecoes.getAlunos().forEach(aluno -> {
//			System.out.println("Aluno:" + aluno);
//		});
		
//		Aluno a4 = new Aluno("Marcelo Borges", 54234);
//		Set<Aluno> alunos = javaColecoes.getAlunos();
//		alunos.add(a4);
		
//		Set<String> nomes = Collections.emptySet();
//      nomes.add("Paulo");
		
		System.out.println("-> O aluno " + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("-> O aluno " + turini + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("a1==turini: " + (a1==turini));

		System.out.println("a1.equals(turini): " + (a1.equals(turini)));
		
		System.out.println("a1.hashCode()==turini.hashCode(): " + (a1.hashCode()==turini.hashCode()));
		
	}

}
