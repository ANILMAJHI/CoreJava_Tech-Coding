
class MyThread extends Thread {

	/*
	 * public void m1() { System.out.println("parent class"); } }
	 * 
	 * class Test extends MyThread { public void m2() { System.out.println(
	 * "chile class"); }
	 */

	String s = null;

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread");
			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {

				// System.out.println(s.length());
			}

		}
	}
}

class ThreadDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		
		mt.start();
		System.out.println(mt.currentThread().getName());
		//mt.run();
		// mt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		// mt.m1();
		// MyThread t=new Test();
		// t.m1();

	}
}
