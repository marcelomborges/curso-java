package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaContaComSaldo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Beelzebub");
		conta.setNumero(6666);
		conta.setAgencia(6666);
		conta.setSaldo(6000.0);
		
		em.getTransaction().begin();
		
		em.persist(conta); //Conta no estado Managed
		
		em.getTransaction().commit();
		
		em.close();
		
		EntityManager em2 = emf.createEntityManager();
		System.out.println("-> ID da Conta: " + conta.getId());
		conta.setSaldo(6666.6); //Conta no estado Detached
		
		em2.getTransaction().begin();
		em2.merge(conta); //Conta no estado Managed (novamente)
		em2.getTransaction().commit();

	}

}
