package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaPedro = new Conta();
		
		contaPedro.saldo = 100;
		System.out.println("Saldo - Conta Pedro: " + contaPedro.saldo);
		
		System.out.println("Deposito - Conta Pedro: 50 temers");
		contaPedro.deposita(50);
		System.out.println("Saldo - Conta Pedro: " + contaPedro.saldo);
		
		System.out.println("\nSaque - Conta Pedro: 20 temers");
		boolean conseguiuRetirar = contaPedro.saca(20);
		System.out.println("Saque realizado: " + conseguiuRetirar);
		System.out.println("Saldo - Conta Pedro: " + contaPedro.saldo);
		
		Conta contaMarcelo = new Conta();
		contaMarcelo.deposita(1000);
		System.out.println("\nSaldo - Conta Marcelo: " + contaMarcelo.saldo);
		
		System.out.println("\nTranferencia: 300 temers (Marcelo -> Pedro): ");
		boolean sucessoTransferencia = contaMarcelo.transfere(300, contaPedro);
		if(sucessoTransferencia) {
			System.out.println("Tranferencia realizada com sucesso!");
		} else {
			System.out.println("Faltou dinheiro.");
		}
		
		System.out.println("Saldo - Conta Marcelo: " + contaMarcelo.saldo);
		System.out.println("Saldo - Conta Pedro: " + contaPedro.saldo);
		
	}
}
