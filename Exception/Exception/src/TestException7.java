import java.util.Scanner;

public class TestException7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int div = num1 / num2;
        System.out.println("Division: " + div);
    }
}
