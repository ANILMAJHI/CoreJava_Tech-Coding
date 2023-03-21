import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8_Predicate {

	public static void main(String[] args) {
		//Predicate<Integer> p=I->(I>10);
		//Predicate<String> p= s->(s.length()>4);
		Predicate<Collection> p= s->s.isEmpty();
		Function<String, Integer> f= s-> s.length();
		System.out.println(f.apply("skjdf"));
		//System.out.println(p.test("a"));
		
		//System.out.println(p.test("ewe"));
		//System.out.println(p.test(10));
		
	}
}
