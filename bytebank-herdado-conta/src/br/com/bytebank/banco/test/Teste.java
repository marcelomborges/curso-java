package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		
		
		ContaCorrente cc = new ContaCorrente(111,111);
		ContaPoupanca cp = new ContaPoupanca(222,222);
		Object c = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
		println();
		println("x");
		println(1);
		println(false);
		println(cc);
		println(cp);
		println(c);

	}
	
	static void println(Object o) {}
	static void println() {}	
	//static void println(int n) {}	
	//static void println(boolean bool) {}
	//static void println(ContaCorrente cc) {}
	//static void println(ContaPoupanca cp) {}

}
