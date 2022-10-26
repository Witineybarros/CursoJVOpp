package application;

import entities.Student;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student stu = new Student();
        System.out.print("Hi,what's ur name?");
        stu.name = sc.nextLine();
        System.out.printf(""
                + "Right %s \n"
                + "Check ur quarterly average\n"
                + "", stu.name);

        System.out.println("Enter ur three notes");
        System.out.print("Note 1:");
        stu.n1 = sc.nextInt();
        System.out.print("Note 2:");
        stu.n2 = sc.nextInt();
        System.out.print("Note 3:");
        stu.n3 = sc.nextInt();

        if (stu.quarterSum() > 60) {
            System.out.println(".-------------------------------.");
            System.out.printf("|    FINAL GRADE: %d POINTS     |\n"
                    + "|     you PASSED,congrat's      |\n"
                    + "|            =D                 |\n"
                    + "*-------------------------------*\n", stu.quarterSum());

        } else if (stu.quarterSum() == 60) {
            System.out.printf(".------------------------------.\n"
                    + "|    FINAL GRADE: %d POINTS    |\n"
                    + "|    \"you PASSED,but u need    |\n"
                    + "|     to study a little more\"  |\n"
                    + "*------------------------------*\n", stu.quarterSum());

        } else {
            System.out.printf(".----------------------------.\n"
                    + "|    FINAL GRADE: %d POINTS  |\n"
                    + "|    you FAILED =[           |\n"
                    + "|    MISSING: %d POINTS      |\n"
                    + "*----------------------------*\n", stu.quarterSum(), 100 - stu.quarterSum());

        }
        sc.close();;
    }

}
