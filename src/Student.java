import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		Student s1 = new Student(99, "d");
		Student s2 = new Student(22, "j");
		Student s3 = new Student(99, "d");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "ram"));
		list.add(new Student(2, "shiva"));
		list.add(new Student(3, "laxma"));
		list.add(new Student(4, "Ganesh"));

		/*
		 * List<Student> l = list.stream().sorted((e1, e2) -> (int) (e1.getId() -
		 * e2.getId())) .collect(Collectors.toList());
		 */

		list.stream().sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName())).forEach(System.out::print);// Student

		// System.out.println(l);

	}

}
