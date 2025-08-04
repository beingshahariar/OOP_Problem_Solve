import java.util.Scanner;

public class TestException10
{
    public static void main(String args[]) {
        try {
            ArithmeticExceptionExample();
            NullPointerExceptionExample();
        }catch (ArithmeticException e) {
            System.out.println("Do not enter 0 as divisor");
            System.out.println ("Error message: " + e);
        }catch (NullPointerException e) {
            System.out.println("Do not enter null as divisor");
            System.out.println ("Error message: " + e);
        }

    }

    public static void ArithmeticExceptionExample() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int c = a / b; // ArithmeticException: / by zero
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void NullPointerExceptionExample() throws NullPointerException {
        String s = null;
        System.out.println(s.length()); // NullPointerException
    }
}
