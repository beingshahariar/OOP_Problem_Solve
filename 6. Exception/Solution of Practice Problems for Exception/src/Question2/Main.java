package Question2;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Error: Age must be between 0 and 120.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(sc.nextLine());
            validateAge(age);
            System.out.println("Your age is: " + age);
        } catch (NumberFormatException e) {
           System.err.println("Error: Invalid age format. Please enter a valid integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
