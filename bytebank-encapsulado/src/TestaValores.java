
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24266);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(2,2);
		Conta conta3 = new Conta(3,3);
		
		System.out.println(Conta.getTotal());
	}
}
