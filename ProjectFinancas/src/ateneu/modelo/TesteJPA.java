package ateneu.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteJPA {

	public static void main(String[] args) {

//		Conta conta = new Conta();
//		
//		conta.setAgencia("1111");
//		conta.setBanco("Bradesco");
//		conta.setNumero("456789");
//		conta.setTitular("Usuario");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("financas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//entityManager.getTransaction().begin();
		
		//Conta conta = entityManager.find(Conta.class, 1);
		
		// conta.setTitular("Nicolas Atualizado");
		//		entityManager.persist(conta);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}

}
