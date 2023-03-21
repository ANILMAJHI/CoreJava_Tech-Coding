import java.util.ArrayList;

public class ArrayOfTheArray {

	public static void main(String[] args) {

		String[] str = { "abc", "def" };
		ArrayList l = new ArrayList();
		for (String data : str) {
			// System.out.println(data);
			l.add(data);
		}
		System.out.println(l);
	}

}
