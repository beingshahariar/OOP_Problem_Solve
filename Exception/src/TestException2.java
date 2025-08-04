import java.util.Scanner;

public class TestException2
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int result = 0;
		try {
			 result = a/b;
		} catch(Exception e) {
			System.out.println("Do not enter 0 as divisor");
			System.out.println ("Error message: " + e);
		}
		System.out.println(a);
		System.out.println(b);
//		System.out.println(result);
	}
}
	