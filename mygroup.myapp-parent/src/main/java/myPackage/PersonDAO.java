package myPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.lang.Long;

public class PersonDAO implements PersonDAOInterface {

	private EntityManagerFactory emf;

	private static final Logger LOGGER = LogManager.getLogger(Person.class);

	public PersonDAO() {
		emf = Persistence.createEntityManagerFactory("my-persistence-unit");
	}

	@Override
	public void insertPerson(Person p) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getPersonByNameAndSurname(String name, String surname) {
		EntityManager em = emf.createEntityManager();
		String query = "FROM person WHERE NAME = 'Federico' AND SURNAME = 'Vaccaro' ";
		Person p1 = null;
		TypedQuery<Person> tq = em.createQuery(query, Person.class);
		try {
			p1 = tq.getSingleResult();
			
		}catch(NoResultException ex) {
			System.out.println(ex);
		}finally {
			em.close();
		}
		return p1;
	}

	public Person getPersonByID(Long id) {
		EntityManager em = emf.createEntityManager();
		Long idObj = new Long(id);
		Person p = (Person) em.find(Person.class, idObj);
		em.close();
		return p;
	}

}
