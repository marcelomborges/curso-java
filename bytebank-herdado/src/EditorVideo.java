
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("-> Pegando bonificacao do EDITOR DE VIDEO.");
		return super.getBonificacao() + 100;
	}

}
