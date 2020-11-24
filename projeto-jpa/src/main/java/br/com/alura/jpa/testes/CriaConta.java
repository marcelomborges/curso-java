package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaConta {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Marcelo");
		conta.setNumero(666);
		conta.setAgencia(777);
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		conta.setSaldo(11000.0);
		
		em.getTransaction().commit();
	}

}
