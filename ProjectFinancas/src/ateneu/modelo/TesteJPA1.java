package ateneu.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteJPA1 {

	public static void main(String[] args) {

		Conta conta = new Conta();

		conta.setAgencia("2121");
		conta.setBanco("Bradesco");
		conta.setNumero("12345");
		conta.setTitular("zezao");

		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("financas");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(conta);
		entityManager.getTransaction().commit();

		entityManager.close();

	}
}
