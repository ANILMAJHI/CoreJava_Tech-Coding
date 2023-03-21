
public class TryWithCatch {
	public static void main(String[] args) {
		try {
			System.out.println("try block"); 
			//return;
			System.out.println(2/0);
		} catch (NullPointerException e) {
			System.out.println("catch the nullpointer block exception...");
		}
		catch (Exception e) {
			System.out.println("catch the try Exception ...");
		}finally {
			System.out.println("finally block");
		}
	}
}
