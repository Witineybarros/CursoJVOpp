
package app;

import entities.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class Exerci_List_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList();

        System.out.print("How many employees will be registered:");
        int registered = sc.nextInt();

        for (int i = 0; i < registered; i++) {

            System.out.println("EMPLOYEE - " + (i + 1));
            System.out.print("Id:");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Salary:");
            Double salary = sc.nextDouble();
            System.out.println("--------------------");

            Employee emp = new Employee(name, id, salary);
            list.add(emp);

        }
        System.out.print("Enter the employee ID that will be increase:");
        int id = sc.nextInt();
        Integer pos = position(list, id);
        if (pos == null) {

            System.out.println(".---------------------.\n"
                    + "| This ID dont exist! |\n"
                    + "*---------------------*");
        } else {
            System.out.println("Enter the percentage:");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);

        }
        System.out.println("");
        System.out.println("List of Employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    static Integer position(ArrayList<Employee> list, int id) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }

        }
        return null;
    }
}
