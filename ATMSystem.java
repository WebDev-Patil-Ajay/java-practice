
import java.util.Scanner;

class ATMSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 10000;

        System.out.println("Enter Your PIN:");
        int pin = sc.nextInt();

        if (pin == correctPin) {

            System.out.println("Login Successful");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your Balance is: " + balance);
            }

            else if (choice == 2) {

                System.out.println("Enter amount to withdraw:");
                int amount = sc.nextInt();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
            }

            else {
                System.out.println("Invalid Choice");
            }

        } else {
            System.out.println("Invalid PIN");
        }
    }
}
