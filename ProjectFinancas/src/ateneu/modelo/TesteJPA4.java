package ateneu.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteJPA4 {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("financas");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();

		Conta c = entityManager.find(Conta.class,2);
				
		entityManager.getTransaction().begin();

		entityManager.remove(c);

		entityManager.getTransaction().commit();

	}
}
