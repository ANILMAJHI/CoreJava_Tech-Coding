import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapRetrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> t = new HashMap<String, Integer>();
		// t.put(292,null);
		 
		t.put("anil", 1);
		t.put("pinku", 2);
		t.put("monua", 3);
		t.put("tankua", 5);
		t.put(null,222);
		t.put("bedhua", 4);
		t.put("bedhua", 7);
		// t.put("babuna","ram");

		Set s = t.entrySet();
		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			Map.Entry m = (Map.Entry) iterator.next();
			System.out.print(m.getValue()+",");
		}
		System.out.println(t.get(s)+"->>>>>>>>>");
		System.out.println(t);
	}
}
