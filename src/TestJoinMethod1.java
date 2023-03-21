class TestJoinMethod1 extends Thread {

	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(500);
				System.out.println(t.getName() + " " + i);
				//System.out.println(i);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

	public static void main(String args[]) throws InterruptedException {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		
		t1.start();
		t1.join(); /* t1.join(1500); then t1 will execute three times. */
		t2.start();
		t2.join();
		t3.start();
		t3.join();

	}
}
