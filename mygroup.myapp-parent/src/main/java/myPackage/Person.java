package myPackage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Entity(name="person")
//@Table(name = "person", schema="public")
public class Person {

	@Transient
	private static final Logger LOGGER = LogManager.getLogger(Person.class);

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Person() {}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String greet() {
		String s = "Hello world by " + name + " " + surname + "!";
		LOGGER.info("TESTING LOGGER : " + s);
		return s;
	}

}
