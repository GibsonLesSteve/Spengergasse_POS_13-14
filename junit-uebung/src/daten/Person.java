package daten;
public class Person {

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("firstName must not be null!");
		}
		if ("".equals(firstName.trim())) {
			throw new IllegalArgumentException(
					"firstName must not empty or whitespaces only!");
		}
		this.firstName = firstName.trim();
	}

	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("lastName must not be null!");
		}
		if ("".equals(lastName.trim())) {
			throw new IllegalArgumentException(
					"lastName must not empty or whitespaces only!");
		}
		this.lastName = lastName.trim();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		// ab 1.6 ok, vorher Wahnsinn!
		// return "Person {firstName=" + firstName + ", lastName=" + lastName +
		// "}";

		// vor 1.5, ab 1.5 StringBuilder
		// return new
		// StringBuffer("Person {").append(firstName).append(", ").append(lastName).append("}").toString();

		return String.format("%s {firstName=%s, lastName=%s}", getClass()
				.getSimpleName(), firstName, lastName);
	}
}