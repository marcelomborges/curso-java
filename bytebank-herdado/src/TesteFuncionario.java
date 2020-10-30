
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico NI");
		nico.setCpf("111222333-44");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
