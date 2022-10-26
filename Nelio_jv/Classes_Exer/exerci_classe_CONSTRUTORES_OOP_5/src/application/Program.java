package application;

import entities.Account;
import java.util.Calendar;
import java.util.Scanner;

public class Program {

    public static int year, month, day, hour, minute, second;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;
        account = new Account();
        Calendar date = Calendar.getInstance();
        hour = date.get(Calendar.HOUR_OF_DAY);
        minute = date.get(Calendar.MINUTE);
        second = date.get(Calendar.SECOND);
        
        System.out.println(".----------.");
        System.out.printf("| %d:%02d:%02d |\n", hour, minute, second);
        System.out.println("*----------*");
        System.out.println("- Welcome to BankNelio -");
        System.out.print("What's ur name?");
        String holder = sc.nextLine();
        account.setHolder(holder);

        System.out.println("-------------------------------");

        if (hour > 0 && hour < 12) {
            System.out.println("Good Morning SR." + account.getHolder());
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon Sr." + account.getHolder());
        } else {
            System.out.println("Good Evening Sr." + account.getHolder());
        }
        System.out.println("");

        System.out.print("now enter your account number:");
        int acNumber = sc.nextInt();

        System.out.print("Is there a initial deposit (y/n)?");
        char yn = sc.next().toLowerCase().charAt(0);
        if (yn == 'y') {
            System.out.print("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();
            account = new Account(holder, acNumber, initialDeposit);

        } else {
            account = new Account(holder, acNumber);

        }
        sc.nextLine();
        System.out.println("");
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println("");
        System.out.print("Enter a deposit velue:");
        double depositvelue = sc.nextDouble();
        account.deposit(depositvelue);
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println("");
        System.out.print("Enter a withDraw value:");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Account data:");
        System.out.println(account);

    }

}
