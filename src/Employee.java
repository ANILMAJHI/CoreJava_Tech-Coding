import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>(new MyComparetor());
		s.add(21);
		s.add(74);
		s.add(32);
		s.add(12);
		System.out.println(s);
	}
}

class MyComparetor implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;

		return i1.compareTo(i2);
	}

}
