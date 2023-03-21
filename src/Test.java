import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Test {

	public static void main(String[] args) {

		System.out.println("hello");

		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(19);
		al.add(10);
		al.add(8);
		al.add(31);
		al.add(12);
		System.out.println(al);

		ArrayList<Integer> al2 = (ArrayList<Integer>) al.stream().map(i -> i + 10).collect(Collectors.toList());
		System.out.println("added 10 value every elements:" + al2);
		ArrayList<Integer> al3 = (ArrayList<Integer>) al2.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even no." + al3);
		ArrayList<Integer> al4 = (ArrayList<Integer>) al.stream().sorted().collect(Collectors.toList());
		System.out.println("sorting order:" + al4);

//		l.add("ff");
//		l.add("ffd");
//		l.add("ffw");
//		System.out.println("size of the arraylist:"+l.size());
//		System.out.println("size of the arraylist:");
//		
//		String s1=new String("java");
//		String s2=new String("java");
//		String s3="java";
//		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));
//				

	}

}
