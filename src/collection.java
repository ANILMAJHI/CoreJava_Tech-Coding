import java.util.*;

class collectionDemo {

	public static void main(String args[]) {
		PriorityQueue<Object> queue = new PriorityQueue<>(); 
		/*queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");*/
		queue.add(3);
		queue.add(9);
		queue.add(7);
		queue.add(73);
		queue.add(8);
		queue.add(4);
		System.out.println(queue);
		/*HashMap queue=new HashMap<>();
		queue.put(null, "aa");
		queue.put(null, "v");
		queue.put(null, "vv");
		System.out.println(queue);*/
		
		//System.out.println("hello");

		/*List<Queue<String>> l=new ArrayList();
		l.add(0, queue);
		System.out.println(l);*/
	}

}