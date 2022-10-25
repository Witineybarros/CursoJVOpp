package app;

import java.util.Scanner;


public class Exerci_Vector_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numberes will be in the vectors:");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("");

        System.out.println("Enter the vector velue  \"A\":");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "st number: ");
            a[i] = sc.nextInt();
        }
        System.out.println("------------------------------");

        System.out.println("Enter the vector velue \"B\":");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "st number: ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println(".-------------------.");
        System.out.println("| Result vector \"C\" |");
        System.out.println("*-------------------*");
        for (int i = 0; i < n; i++) {

            System.out.printf("|   %dst number: %d   |\n", (i + 1), c[i]);

        }
        System.out.println("*-------------------*");
        sc.close();
    }

}
