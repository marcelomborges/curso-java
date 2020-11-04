package br.com.bytebank.banco.test.util;

import java.util.*;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(111, 111);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(222, 222);
		lista.add(cc2);

		System.out.println("-> Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("-> Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(333, 333);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(444, 444);
		lista.add(cc4);
		
		System.out.println("------------------------");
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("------------------------");
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}
