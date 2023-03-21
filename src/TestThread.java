
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
public class TestThread extends Thread {
	static ConcurrentHashMap<Integer,String> m=new ConcurrentHashMap<>();
	public void run()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("child Thread in updating");
		m.put(1, "d");
	}
	public static void main(String[] args) throws InterruptedException{
		
		m.put(2, "f");
		m.put(4, "s");
		m.put(6, "b");
		TestThread tt=new TestThread();
		tt.start();
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			System.out.println(m.get(i));
			Thread.sleep(3000);
		}
		System.out.println(m);
	}
	
}