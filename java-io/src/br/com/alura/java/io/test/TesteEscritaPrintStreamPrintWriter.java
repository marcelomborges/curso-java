package br.com.alura.java.io.test;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
	
	public static void main(String[] args) throws IOException{
		
		long ini = System.currentTimeMillis();
		
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("-> Teste de Escrita - Linha 1");
		ps.println();
		ps.println("-> Teste de Escrita - Linha 2");
		
		ps.close();
		
		long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

	}
}
