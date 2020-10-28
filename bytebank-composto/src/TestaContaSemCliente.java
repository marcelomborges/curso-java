
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaMarcelo = new Conta();
		System.out.println(contaMarcelo.pegaSaldo());
		
		contaMarcelo.titular = new Cliente();
		
		contaMarcelo.titular.nome = "Marcelo";
		System.out.println(contaMarcelo.titular.nome);
	}
}
