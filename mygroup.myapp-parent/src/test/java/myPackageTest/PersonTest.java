package myPackageTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import myPackage.Person;


public class PersonTest {

	@Test
	public void testGreetingPerson() {
		Person p = new Person("Federico", "Vaccaro");
		String greetings = p.greet();
		assertEquals(greetings, "Hello world by Federico Vaccaro!");
	}
	
}
