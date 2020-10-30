
public class Gerente extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("-> Pegando bonificacao do GERENTE.");
		return super.getSalario();
	}
}
