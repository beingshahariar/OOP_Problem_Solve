import java.util.Scanner;

public class TestException1
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int c = a/b; // ArithmeticException: / by zero
        System.out.println(a);
		System.out.println(b);
		System.out.println(c);
        String s = null;
//        System.out.println(s.length()); // NullPointerException
    }
}	
