package app;


import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Haw many numbers will u enter:");
        int n = sc.nextInt();

        int[] vec = new int[n];

        for (int i = 0; i < vec.length; i++) {
            System.out.print("Number " + (i + 1) +":");
            vec[i] = sc.nextInt();   
        }
        System.out.println("-> negative numbers <-");
        for(int i = 0; i < vec.length; i++ ){
            if(vec[i] < 0){
                System.out.println("~> " + vec[i]);
            }
        }
        
        sc.close();
    }

}
