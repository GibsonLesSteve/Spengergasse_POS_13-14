package daten;
import java.util.Set;
import java.util.TreeSet;

public class Course {

	private String name;

	private final Set<Student> students = new TreeSet<Student>();

	public void addStudent(Student student) {
		if (student == null) {
			throw new IllegalArgumentException(
					"student to add must not be null!");
		}
		if (students.contains(student)) {
			return;
		}
		students.add(student);
	}

	public boolean removeStudent(Student student) {
		if (student == null) {
			throw new IllegalArgumentException(
					"student to remove must not be null!");
		}
		return students.remove(student);
	}
}
