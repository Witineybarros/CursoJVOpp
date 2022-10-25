
package app;

import java.util.Scanner;

public class Exerci_Vector_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Haw many numbers will u enter:");
        int n = sc.nextInt();
        int[] vec = new int[n];
        System.out.println("______________________________");

        for (int i = 0; i < vec.length; i++) {
            System.out.print("Number:");
            vec[i] = sc.nextInt();
        }

        int big = vec[0];
        int nextBig = 0;

        for (int i = 0; i < vec.length; i++) {

            if (vec[i] > big) {
                big = vec[i];
                nextBig = i;
            }
        }

        System.out.println("Big value: " + big
                + "\nPOSITION: " + nextBig);

        sc.close();
    }

}
