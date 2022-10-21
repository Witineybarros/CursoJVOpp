/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import entities.Person;
import java.util.Scanner;

public class ExerciNelioVector3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Haw many names will u enter:");
        int n = sc.nextInt();
        Person[] vec = new Person[n];

        for (int i = 0; i < vec.length; i++) {
            sc.nextLine();

            System.out.println(".----------------------------.");
            System.out.println("|  -> " + (i+1) + "st person data <-     |");
            System.out.print("|name:");
            String name = sc.nextLine();
            System.out.print("|age:");
            int age = sc.nextInt();
            System.out.print("|height:");
            float height = sc.nextFloat();
            vec[i] = new Person(name, age, height);
            System.out.println("*----------------------------*");
        }

        float avg = 0;
        for (int i = 0; i < vec.length; i++) {
            avg += vec[i].getHeight() / n;
        }

        int cont = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i].getAge() < 16) {
                cont += 1;
            }
        }
        double percent = cont * 100.0 / n;
        System.out.println("----------- REPORT -----------");
        System.out.printf("- Average height: %.2f%n", avg);
        System.out.printf("- Persons under the age of 16: %.2f%%%n", percent);
        System.out.printf("- Names: ");

        for (int i = 0; i < vec.length; i++) {
            if (vec[i].getAge() < 16) {
                System.out.print(vec[i].getName());

            }

        }
        sc.close();
    }
}
