package br.com.alura.java.io.test;

import java.util.*;
import java.io.*;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException{

		Scanner scanner = new Scanner(new File("contas2.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
//			String.format(new Locale("pt","BR"), "string", variaveis);
//			String valorFormatado = String.format(Locale.US, "%s - %04d-%08d, %20s: %08.2f",
//					tipoConta, agencia, numero, titular, saldo);
//			System.out.println(valorFormatado);
			
			System.out.format(Locale.US, "%s - %04d-%08d, %20s: %08.2f %n",
					tipoConta, agencia, numero, titular, saldo);
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
//			System.out.println(valores[3]);
			
			linhaScanner.close();
		}
		
		scanner.close();
	}

}
