package application;

import entities.Employee;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();

        System.out.print("Name:");
        em.name = sc.nextLine();
        System.out.print("Gross salary:");
        em.grossSalary = sc.nextDouble();
        System.out.print("Tax:");
        em.tax = sc.nextDouble();
        System.out.println("---------------------------------------");
        System.out.println("Employee:" + em.name);
        System.out.printf("Salary - Tax: %.2f%n",  (em.grossSalary - em.tax));
        System.out.println("Witch percentage to increase salary?");
        double percentege = sc.nextDouble();
        em.increaseSalary(percentege);
        System.out.println("Update salary:");
        System.out.println(".-------------------------------------.");
        System.out.printf("Name: %s%n", em.name);
        System.out.printf("Salary: %.2f%n", em.netSalary());
        System.out.println("*-------------------------------------*");
    }

}
