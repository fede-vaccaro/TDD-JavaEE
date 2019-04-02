package myPackageTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;

import myPackage.Person;
import myPackage.PersonDAO;

public class PersonDAOTest {

	private static PersonDAO pDao;

	@BeforeClass
	public static void initializePersonDAO() {
		pDao = new PersonDAO();
	}

	@Test
	public void getPersonByNameAndSurnameTest() {
		Person resultPerson = null;
		resultPerson = pDao.getPersonByNameAndSurname("Federico", "Vaccaro");
		assertEquals(resultPerson.getName(), "Federico");
		assertEquals(resultPerson.getSurname(), "Vaccaro");
	}
	
	@Test
	public void getPersonByID() {
		Person resultPerson = null;
		resultPerson = pDao.getPersonByID(6l);
		assertEquals(resultPerson.getName(), "Federico");
		assertEquals(resultPerson.getSurname(), "Vaccaro");
	}
}
