import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		String s="java";
		//String s1="java";
		String s2=new String("java");
		String s3=s2.intern();
		
		System.out.println(s==s2);
		System.out.println(s2==s3);
		System.out.println(s==s3);
		/*
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		*/
		
		Map<Object,String> map=new HashMap<Object,String>();
		System.out.println(map.size());
		
		int[] array=new int[2];
		
		array[0]='H';
		System.out.println(array[0]);
		List<String> l=new ArrayList<String>();
		l.add("ac");
		l.add("bn");
		l.add("bn");
		l.add("bn");
		//System.out.println(l);
		List<String> unmodifiableList=Collections.unmodifiableList(l);
		int i=Collections.frequency(l,"bn");
		
		System.out.println("unmodifiableList:"+unmodifiableList);
		System.out.println("i:"+i);
		
		unmodifiableList.add("sakha");
	}
}
