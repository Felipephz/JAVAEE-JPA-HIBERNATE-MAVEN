package application;

import domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
	public static void main (String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class, 2);
		em.getTransaction().begin(); // transaction to make alterations
		em.remove(p); // removing a person from your database
		em.getTransaction().commit(); //transaction to make alterations
		
		System.out.println("PRONTO!");
		em.close();
		emf.close();
	}
}
