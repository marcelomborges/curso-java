package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(111, 111);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(222, 222);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		System.out.println(cc2.getNumero());
		//System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//Type Cast
		//ContaCorrente ref = (ContaCorrente) referencias[1];//ClassCastException
		System.out.println(ref.getNumero());
	}

}
