package Question3;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds. Your current balance is " + balance);
        }
       else{ balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);}
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the withdrawal amount: ");
            double withdrawalAmount = Double.parseDouble(sc.nextLine());
            account.withdraw(withdrawalAmount);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input format. Please enter a valid number.");
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
