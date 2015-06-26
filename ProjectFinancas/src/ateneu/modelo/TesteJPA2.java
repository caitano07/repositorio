package ateneu.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteJPA2 {

	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("financas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Conta conta = entityManager.find(Conta.class, 1);
		
				conta.setTitular("zezao da silva");
				conta.setBanco("Santander");
				entityManager.persist(conta);

				entityManager.getTransaction().commit();
		
		
	}
}
