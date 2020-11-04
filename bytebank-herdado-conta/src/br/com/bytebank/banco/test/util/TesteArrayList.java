package br.com.bytebank.banco.test.util;

import java.util.*;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//ArrayList<Conta> lista = new ArrayList<Conta>();
		//LinkedList<Conta> lista = new LinkedList<Conta>();
		//Vector<Conta> lista = new Vector<Conta>();
		//Collection<Conta> lista = new Vector<Conta>();
		List<Conta> lista = new ArrayList<Conta>();//thread safe
		
		Conta cc = new ContaCorrente(111, 111);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(222, 222);
		lista.add(cc2);

		System.out.println("-> Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("-> Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(333, 333);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(444, 444);
		lista.add(cc4);
		
		System.out.println("------------------------");
		
		for(int i = 0; i < lista.size(); i++) {
			Conta conta = lista.get(i);
			System.out.println(conta);
		}
		
		System.out.println("------------------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
