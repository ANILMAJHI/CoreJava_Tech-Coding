import java.util.Iterator;

class Test2 {

	/*
	 * 
	 * public void m1() {
	 * System.out.println(" I am in parent class instance method m1 "); }
	 * 
	 * public static void m2() {
	 * System.out.println(" I am in parent class instance method m2"); } }
	 * 
	 * class Test3 extends Test2 { public void m1() {
	 * System.out.println(" I am in child class instance method m1 "); }
	 * 
	 * public static void m2() {
	 * System.out.println(" I am in child class instance method m2"); } }
	 */
}

public class Test111 {
	public static void main(String[] args) {
		

		babulSort(new int[] { 3, 6, 4, 9, 7, 2 });
		

	}

	private static void babulSort(int[] num) {

		int n = num.length;
		int temp = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (num[j-1] > num[j]) {
					temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}
				
			}
			

		}
		
	}

	// Test2 t3 = null;
	// t3.m1();
	/*
	 * t3.m2(); Test1 t4 = new Test3(); t4.m1(); t4.m2(); Test1 t5 = new Test1();
	 * t5.m1(); t5.m2();
	 */

	/*
	 * try { System.out.println(10 / 0); System.out.println("hii");
	 * 
	 * } catch(ArrayIndexOutOfBoundsException e){ System.out.println(
	 * "catch block"); } finally { System.out.println("finally block");
	 * System.out.println("ss"); }
	 * 
	 * System.out.println("hello");
	 */
}
