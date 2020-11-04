package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta conta1 = new ContaCorrente(111, 111);
		Conta conta2 = new ContaPoupanca(222, 222);
		Cliente cliente = new Cliente();
		
		guardador.adiciona(conta1);
		guardador.adiciona(conta2);
		guardador.adiciona(cliente);
		
		for(int i=0; i < guardador.getQuantidadeDeElementos(); i++) {
			System.out.println(guardador.getReferencia(i));
		}

	}

}
