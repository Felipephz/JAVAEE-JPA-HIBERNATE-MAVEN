package application;

import domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
	public static void main (String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class, 2); // accessing data with JPA
		
		System.out.println(p);
		
		System.out.println("PRONTO!");
		em.close();
		emf.close();
	}
}
