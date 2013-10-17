package test;

import static org.junit.Assert.*;
import org.junit.*;

import daten.Person;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testPerson() {

		fail("Not yet implemented");
	}

	@Test
	public void constructorWithValidArguments() {
		Person p = new Person("Klaus", "Unger");
		assertSame("Klaus", p.getFirstName());
		assertSame("Unger", p.getLastName());

		p = new Person("Klaus   ", "Unger   ");
		assertEquals("Klaus", p.getFirstName());
		assertEquals("Unger", p.getLastName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorWithNullArgumentForFirstName() {
		Person p = new Person(null, "Unger");
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorWithEmptyArgumentForFirstName() {
		Person p = new Person("", "Unger");
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorWithWhiteSpaceArgumentForFirstName() {
		Person p = new Person(" ", "Unger");
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorWithNullArgumentForLastName() {
		Person p = new Person("Klaus", null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorWithEmptyArgumentForLastName() {
		Person p = new Person("Klaus", "");
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorWithWhiteSpaceArgumentForLastName() {
		Person p = new Person("Klaus", " ");
	}

	@Test
	public void testToString() {
		Person person = new Person("Klaus", "Unger");
		assertEquals("Person {firstName=Klaus, lastName=Unger}",
				person.toString());
	}

}
