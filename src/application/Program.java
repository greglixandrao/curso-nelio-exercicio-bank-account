package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();

        System.out.print("Enter account holder: ");
        scan.nextLine();
        String name = scan.nextLine();

        double value = 0;
        System.out.print("Is the a initial deposit (y/n)? ");
        char answer = scan.next().charAt(0);
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            value += scan.nextDouble();
        }

        Account account = new Account(accountNumber, name, value);

        System.out.println("Account data: " + account);

        System.out.println("Enter a deposit value: ");
        account.deposit(scan.nextDouble());
        System.out.println("Update account data: " + account);

        System.out.println("Enter a withdraw value: ");
        account.withdraw(scan.nextDouble());
        System.out.println("Update account data: " + account);

        scan.close();
    }
}
