package myPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import myPackage.Person;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Person p1 = new Person("Federico","Vaccaro");
		em.persist(p1);
		
		em.getTransaction().commit();
		em.close();
	}

}
