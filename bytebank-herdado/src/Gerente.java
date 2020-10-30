
public class Gerente extends Funcionario {
	private int senha;
	
	public double getBonificacao() {
		System.out.println("-> Pegando bonificacao do GERENTE.");
		return super.getSalario();
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
}
