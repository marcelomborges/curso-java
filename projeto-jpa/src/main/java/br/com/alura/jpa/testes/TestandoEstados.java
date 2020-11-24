package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
		
		//Estado Transient
		Conta conta = new Conta();
		conta.setTitular("Dante");
		conta.setAgencia(77);
		conta.setNumero(777);
		conta.setSaldo(77.77);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Transient -> Managed
		em.persist(conta);
		
		//Managed -> Removed
		em.remove(conta); //Deleta a conta do banco de dados

		em.getTransaction().commit();
	}

}
