package myPackage;

public interface PersonDAOInterface {

	public void insertPerson(Person p);
	public Person getPersonByNameAndSurname(String name, String surname);
}
