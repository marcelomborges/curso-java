package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(111, 111);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(222, 222);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}
}
