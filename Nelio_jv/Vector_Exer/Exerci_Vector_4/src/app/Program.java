

package app;

import entities.Rent;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vec_room = new Rent[10];

        System.out.print("How many rooms will be rentend?");
        int quantity_room = sc.nextInt();

        for (int i = 1; i <= quantity_room; i++) {
            System.out.printf("Rent #%d:\n", i);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.next();
            System.out.print("Room:");
            int roomNumber = sc.nextInt();
            System.out.println("-----------");

            vec_room[roomNumber] = new Rent(name, email);
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < vec_room.length; i++) {
            if (vec_room[i] != null) {
                System.out.printf("%d: %s%n", i, vec_room[i]);
                System.out.println("----------");
            }
        }
        
        sc.close();

    }

}
