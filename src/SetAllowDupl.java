import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetAllowDupl {
	public static void main(String[] args) {
		
	/*private int id;
	private String name;
	public SetAllowDupl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "SetAllowDupl [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Set s=new HashSet<>();
		s.add(new SetAllowDupl(11, "aaa"));
		s.add(new SetAllowDupl(11, "bbb"));
		System.out.print(s);
	}*/
	/*ArrayList<Integer> al = new ArrayList();
	al.add(1);
	al.add(3);
	al.add(2);
	al.add(8);
	al.add(6);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);*/
	//}
	
		//HashMap m=new HashMap<>();
		ConcurrentHashMap m=new ConcurrentHashMap<>();
		m.put(11, "AA");
		//m.put(11, "BB");
		m.remove(11, "bb");
		m.putIfAbsent(11, "CC");
		
		System.out.println(m);
		ArrayList l1=new ArrayList<>();
		l1.add("a");
		l1.add("b");
		
		CopyOnWriteArrayList l2=new CopyOnWriteArrayList<>();
		l2.add("a");
		l2.add("a");
		l2.add("c");
		l2.addAll(l1);
		System.out.println(l2);
	}
}
	
