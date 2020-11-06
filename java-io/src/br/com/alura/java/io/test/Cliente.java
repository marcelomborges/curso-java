package br.com.alura.java.io.test;

import java.io.Serializable;

/**
 * Classe que representa um Cliente no ByteBank
 * 
 * @author Marcelo M. B.
 * 
 */

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8524871403510183182L;
	//private static final long serialVersionUID = 7312901622566415045L;
	//private static final long serialVersionUID = 579154429921470416L;
	
	private String nome;
	private String cpf;
	private String profissao;

	public String getNome() {
		return nome;
	}
	
	public String getNomeCPF() {
		return this.nome + ", " + this.cpf;
	}
	
	public String getNomeCPFProfissao() {
		return this.nome + ", " + this.cpf + ", " + this.profissao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
