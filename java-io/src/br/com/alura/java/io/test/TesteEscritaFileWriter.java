package br.com.alura.java.io.test;

import java.io.*;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException{
		
		//Fluxo de Saida com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Teste de Escrita Linha 1");
		bw.newLine();
		bw.newLine();
		bw.write("Teste de Escrita Linha 2");
		
//		fw.write("Teste de Escrita Linha 1");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("Teste de Escrita Linha 2");
		
		bw.close();
	}

}
