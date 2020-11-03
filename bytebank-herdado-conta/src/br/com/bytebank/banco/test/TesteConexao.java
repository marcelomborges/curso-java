package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("-> Erro");
		}
		
		/*-------------------------------------------
		
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("-> Erro");
		} finally {
			System.out.println("-> Finally");
			if(con != null) {
				con.close();
			}
		}
		*/
	}
}
