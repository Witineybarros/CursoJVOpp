package app;

import java.util.Scanner;

public class Exerci_Vector_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Haw many numbers will u enter:");
        int n = sc.nextInt();
        int[] vec = new int[n];
        System.out.println("______________________________");

        for (int i = 0; i < vec.length; i++) {
            System.out.print("Number " + (i + 1) + ":");
            vec[i] = sc.nextInt();
        }

        System.out.println("________________________________");
        int pair = 0;
        System.out.print("even number:");
        for (int i = 0; i < vec.length; i++) {
            if ((vec[i] % 2) == 0) {

                System.out.print(" " +vec[i] );
                pair++;
            }
        }
        System.out.printf("\neven number amount: %d%n", pair);

        sc.close();
    }

}
