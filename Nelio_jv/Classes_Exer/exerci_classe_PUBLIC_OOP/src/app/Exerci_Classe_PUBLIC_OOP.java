
package app;

import entities.Rectangle;
import java.util.Scanner;

public class Exerci_Classe_PUBLIC_OOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println("Enter the Rectangle Measurements:");
        System.out.print("width:");
        rec.width = sc.nextDouble();
        System.out.print("heigth:");
        rec.height = sc.nextDouble();
        System.out.println("------------------------------------");
        System.out.printf("Rectangle AREA:%.2f%n", rec.area());
        System.out.printf("Rectangle PERIMETER:%.2f%n", rec.perimeter());
        System.out.printf("Rectangle DIAGONAL:%.2f%n", rec.diagonal());
    }

}
