
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
		
		nico.setNome("Nico NI");
		nico.setCpf("111222333-44");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
