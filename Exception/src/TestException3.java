public class TestException3
{
	public static void main(String args[]) 
	{
		int a = 10, b = 0, c = 0;
		try {
			 c = a/b;
			 System.out.println("Hello");
			 System.out.println("World");		
		} catch(Exception e) {
			System.out.println (e);
			return;
		} finally {
			// finally block will always execute
            System.out.println ("In Finally");
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);						
	}
}
	