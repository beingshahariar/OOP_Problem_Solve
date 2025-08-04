import java.util .*;
public class TestExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean successful = false;
        while (!successful) {
            System.out.println("Enter 2 integers: ");
            try {
                int a = scan.nextInt();
                int b = Integer.parseInt(scan.nextLine().trim());
                int c = a / b;
                System.out.println("Result: " + c);
                successful = true;
            } catch (ArithmeticException e) {
                System.out.println("Can not divide by 0.");
            } catch (InputMismatchException e) {
                System.out.println("Need 2 numbers for division. Input mismatch exception.");
                if (scan.hasNextLine())
                    scan.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Need 2 numbers for division. Number Format exception. ");
            }
        }
        scan.close();
    }
}
