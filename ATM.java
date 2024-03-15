package Internship;

import java.util.InputMismatchException;
import java.util.Scanner;

// Bank Account class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
    	if(initialBalance>0) {
        balance = initialBalance;
    	}
    	else {
    		System.out.println("Transaction Declined!!!");
    	}
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current Balance: " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient balance.");
        }
    }
}

// ATM class
public class ATM {
    private BankAccount bankAccount;

    // Constructor
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Method to display options
    public void displayOptions() {
        System.out.println("ATM Options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    // Method to perform selected action
    public void performAction(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("Current Balance: " + bankAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                bankAccount.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                bankAccount.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Thank you for using our services. Visit Again!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(initialBalance); // Initial balance of $1000
        ATM atm = new ATM(bankAccount);

        while (true) {
        	try {
            atm.displayOptions();
            System.out.print("Enter your Option: ");
            int option = scanner.nextInt();
            atm.performAction(option);
        	}
        	catch(InputMismatchException e){
        		System.out.println("Choose the Correct Option in Numbers!!");
        		System.out.println("Try Again!");
        		break;
        	}
        }
    }
}
