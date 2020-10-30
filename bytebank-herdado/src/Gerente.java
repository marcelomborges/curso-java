
public class Gerente extends FuncionarioAutenticavel {
		
	public double getBonificacao() {
		System.out.println("-> Pegando bonificacao do GERENTE.");
		return super.getSalario();
	}
}
