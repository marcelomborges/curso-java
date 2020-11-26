package br.com.alura.jpa.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestaSomaDasMovimentacoes {

	public static void main(String[] args) {

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select sum(m.valor) from Movimentacao m";
		TypedQuery<BigDecimal> query = em.createQuery(jpql, BigDecimal.class);
		BigDecimal somaDasMovimentacoes = query.getSingleResult();
		
		System.out.println("Soma das Movimenta��es: " + somaDasMovimentacoes);
		
		String jpql2 = "select avg(m.valor) from Movimentacao m";
		TypedQuery<Double> query2 = em.createQuery(jpql2, Double.class);
		Double mediaDasMovimentacoes = query2.getSingleResult();
		
		System.out.println("M�dia das Movimenta��es: " + mediaDasMovimentacoes);
	}

}