import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class HashMapDemo {

	public static void main(String[] args) {
		// HashSet s=new HashSet<>();
		/*TreeSet s = new TreeSet<>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.add("5");
		s.add("6");
		s.add("7");
		s.add("8");
		s.add("9");
		
		
		System.out.println(s);
		HashSet s3=new HashSet<>();
		s3.add("1");
		s3.add("2");
		s3.add("3");
		s3.add("4");
		s3.add("5");
		s3.add("6");
		s3.add("7");
		s3.add("8");
		s3.add("9");
		s3.add("10");
		System.out.println(s3);*/
		System.out.println("--------------");
		TreeSet s = new TreeSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(61);
		s.add(7);
		s.add(8);
		s.add(9);
		
		
		System.out.println(s);
		HashSet s3=new HashSet<>();
		s3.add(1);
		s3.add(2);
		s3.add(3);
		s3.add(4);
		s3.add(5);
		s3.add(6);
		s3.add(7);
		s3.add(8);
		s3.add(9);
		s3.add(10);
		;
		HashMap hs=new HashMap<>();
		hs.put(1, "hari");
		hs.put(null, "gopal");
		hs.put(2, "sai");
		hs.put(2, "ram");
		System.out.println("the size of the hashmap is:"+hs.size());
		
		
		System.out.println(s3);
		// TreeSet s1=new TreeSet<>();
		//HashSet s1 = new HashSet<>();
		ArrayList<String> s1=new ArrayList<>();
		s1.add("a");
		s1.add("d");
		s1.add("c");
		s1.add("a");
		s1.add("f");
		s1.add("b");
		s1.add("g");
		//System.out.println(s1);
		TreeSet s2=new TreeSet<>();
		s2.add("a");
		s2.add("d");
		s2.add("c");
		s2.add("a");
		s2.add("f");
		s2.add("b");
		s2.add("g");
		//System.out.println(s2);

	}
}
