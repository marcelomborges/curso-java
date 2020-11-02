
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(111,111);

		conta.deposita(200);
		try {
			conta.saca(210);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}

}
