import java.io.FileNotFoundException;
import java.io.IOException;

class A {
	
	public void m1() throws IOException{
		System.out.println("m1");
	}
}

class B extends A {

	public void m1() {
		System.out.println("m2");
	}
}

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		/*
		 * String s = null; try {
		 * 
		 * System.out.println(s.length()); System.out.println(10 / 0); } catch
		 * (NullPointerException|ArithmeticException e) {
		 * 
		 * System.out.println("catch block nullpointerexception"); return;
		 */
		/*
		 * catch (ArithmeticException e) {
		 * 
		 * System.out.println("catch block arithmaticexception"); return; }
		 * finally {
		 * 
		 * String ss=null; ss.length();
		 * 
		 * System.out.println("finally block");
		 */
		// }
		B b=new B();
		b.m1();
		//b.m2();
	}
}
