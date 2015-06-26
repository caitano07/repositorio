package ateneu.modelo;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteJPA3 {

	
	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("financas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Conta c = new Conta();
		c.setId(1);
		
		entityManager.getTransaction().begin();
		entityManager.merge(c);

		entityManager.getTransaction().commit();

	}
}
