package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TestaMovimentacoesFiltradasPorDataCriteria {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		MovimentacaoDao dao = new MovimentacaoDao(em);
		//List<Movimentacao> movimentacoesFiltradasPorData = dao.getMovimentacoesFiltradasPorData(null, null, 2017);
		//List<Movimentacao> movimentacoesFiltradasPorData = dao.getMovimentacoesFiltradasPorData(12, null, 2017);
		//List<Movimentacao> movimentacoesFiltradasPorData = dao.getMovimentacoesFiltradasPorData(null, 11, null);
		List<Movimentacao> movimentacoesFiltradasPorData = dao.getMovimentacoesFiltradasPorData(null, null, null);
		
		System.out.println("--------------------------------------------------");
		for (Movimentacao movimentacao : movimentacoesFiltradasPorData) {
			System.out.println("-> Descrição: " + movimentacao.getDescricao());
			System.out.println("-> Valor: " + movimentacao.getValor());
			System.out.println("--------------------------------------------------");
		}

	}

}
