
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente marcelo = new Cliente();
		
		marcelo.cpf = "111.111.111-11";
		marcelo.nome = "Marcelo Borges";
		marcelo.profissao = "Programador";
		
		Conta contaMarcelo = new Conta();
		contaMarcelo.deposita(100);
		
		contaMarcelo.titular = marcelo;
		System.out.println(contaMarcelo.titular.nome);
	}
}
