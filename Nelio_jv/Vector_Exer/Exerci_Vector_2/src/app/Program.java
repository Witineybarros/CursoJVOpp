package app;


import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Haw many numbers will u enter:");
        int n = sc.nextInt();

        float[] vec = new float[n];

        for (int i = 0; i < vec.length; i++) {
            System.out.print("Number "+ (i+1)+":");
            vec[i] = sc.nextInt();
        }
        System.out.println("-------------------");
        float sum = 0;
        float p = 0;
        for (int i = 0; i < vec.length; i++) {
            sum += vec[i];
            
        }
        System.out.print("Values:");
        for(int i = 0; i < vec.length; i++){
            
            System.out.printf("%.2f  ", vec[i]);
        }
        
        float media = sum / n;
        System.out.println("");
        System.out.printf("Sum:%.2f%n", sum);
        System.out.printf("media:%.2f%n", media);
        
        sc.close();
    }

}
