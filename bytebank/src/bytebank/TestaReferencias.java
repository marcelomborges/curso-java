package bytebank;

public class TestaReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Primeira Conta - Saldo: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Segunda Conta - Saldo: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Segunda Conta - Saldo: " + segundaConta.saldo);
		
		System.out.println("Primeira Conta - Saldo: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
	}

}
