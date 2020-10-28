
public class TesteGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();

		// conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());

		Cliente marcelo = new Cliente();

		// marcelo.nome = "Marcelo";
		marcelo.setNome("Marcelo");

		// conta.titular = marcelo;
		conta.setTitular(marcelo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// Em duas linhas
		Cliente titularConta = conta.getTitular();
		titularConta.setProfissao("Programador!");
		
		System.out.println(titularConta);
		System.out.println(marcelo);
		System.out.println(conta.getTitular());
	}
}
