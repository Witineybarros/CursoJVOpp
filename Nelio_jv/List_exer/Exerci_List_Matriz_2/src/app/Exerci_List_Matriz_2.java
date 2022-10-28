package app;

import java.util.Scanner;

public class Exerci_List_Matriz_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digitite o tipo de MATRIZ");
        int matriz = sc.nextInt();
        
        System.out.println("Digitte os numeros x y x:");

        int[][] mat = new int[matriz][matriz];

        for (int i = 0; i < mat.length; i++) {
            for (int c = 0; c < mat[i].length; c++) {
                mat[i][c] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal da Matriz");

        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);

        }

        System.out.println("números negativos:");
        int cont = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int c = 0; c < mat[i].length; c++) {
                if (mat[i][c] < 0) {
                    cont++;
                }
            }  
        }
        System.out.println(cont);
    }
}
