import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class TestException11 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter an integer between 1 and 100
            System.out.print("Enter an integer between 1 and 100: ");
            int num = scanner.nextInt();

            // Check if the number is out of range
            if (num < 1 || num > 100) {
                throw new OutOfRangeException("OutOfRangeException: Number must be between 1 and 100.");
            }

            // Display the number if it's within the valid range
            System.out.println("You entered: " + num);

        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
