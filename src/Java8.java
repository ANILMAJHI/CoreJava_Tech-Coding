import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8 {

	
	  public void m1(int a,int b) { System.out.println(a+b); }
	 
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put(null, 40);
		map.put("E", 50);
		map.put("F", null);

		map.forEach((k, v) -> {
			if (k != null) {
				// System.out.println(""+k +","+v);
			}
		});
		// List<Integer> list= Arrays.asList(3,2,66,52,42,12,33);
		// List<Integer> list= new ArrayList<Integer>();
		// List<String> list= new ArrayList<String>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(66);
		list.add(52);
		list.add(42);
		list.add(13);
		// list.add("Ganesh");list.add("Hanuman");list.add("Krishna");list.add("Siva");list.add("Jaganath");list.add("Ram");

		List l1 = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());// [2, 66, 52, 42]

		Long l = list.stream().filter(s -> s % 2 == 0).count(); // 4
		 System.out.println("total list count: " + l);
		// System.out.println("even no: " + l1);
		// list.stream().filter(t->t>33).sorted().forEach(t->System.out.println(t));
		// list.stream().sorted().forEach(t -> System.out.println(t));
		// List<Integer> l=list.stream().filter(t->t<30).collect(Collectors.toList());
		// System.out.println(l); //[3, 2, 13]
		System.out.println("-------------------------");
		// List<String> l = list.stream().map(t ->
		// t.toUpperCase()).collect(Collectors.toList());
		// list.stream().map(s->s.equalsIgnoreCase("siva")).collect(Collectors.toList());

		// List<String>
		// l=list.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		// list.stream().forEach(t -> System.out.println(t));
		// list.stream().forEach(System.out::println);

		// System.out.println(l1);
		// System.out.println("Sorting of the list is: "+l);
	}
}
