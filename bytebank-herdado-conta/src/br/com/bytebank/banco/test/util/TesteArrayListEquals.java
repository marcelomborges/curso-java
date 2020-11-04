package br.com.bytebank.banco.test.util;

import java.util.*;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta cc = new ContaCorrente(111, 111);
//		Conta cc2 = new ContaCorrente(111, 111);
//		
//		boolean igual = cc.ehIgual(cc2);
//		System.out.println(igual);
		
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(111, 111);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(222, 222);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(222, 222);
		
		boolean exist = lista.contains(cc3);
		System.out.println("-> Já existe cc3? " + exist);
		
		for(Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("-> Já existe essa referência");
			}
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}

}
