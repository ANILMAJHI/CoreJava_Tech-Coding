import java.io.IOException;

class Test11 {
	void TestC()throws Exception {
		System.out.println("super constructor");
	}
}

class Test1 extends Test11 {
	
	void TestC()throws IOException{
		System.out.println("child constructor");
	}
}

public class OverloadingDemo {

	public void m1(String s)
	{
		System.out.println("String arg...");
	}

	public void m1(StringBuffer s)
	{
		System.out.println("StringBuffer arg...");
	}
	
	public static void main(String[] args) {

		OverloadingDemo d=new OverloadingDemo();
		d.m1(new StringBuffer("anil"));
		StringBuffer s=null;
		d.m1(s);
	}

}
