package Question4;

import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class Main {
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
            throw new InvalidEmailException("Error: Invalid email format. Email must contain exactly one '@' symbol.");
        }

        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];

        if (username.contains(" ") || domain.contains(" ") || domain.indexOf(".") == -1) {
            throw new InvalidEmailException("Error: Invalid email format. Username and domain should not contain spaces, and domain must have at least one '.' symbol.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your email address: ");
            String email = sc.nextLine();
            validateEmail(email);
            System.out.println("Your email address is: " + email);
        } catch (InvalidEmailException e) {
            System.err.println(e.getMessage());
        }
    }
}
