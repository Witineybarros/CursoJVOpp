
package application;

import java.util.Scanner;
import util.CurrencyConverter;

/**
 *
 * @author eduar
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price: R$");
        CurrencyConverter.price = sc.nextDouble();
        System.out.print("How many dollars will be bought: U$");
        CurrencyConverter.dollar = sc.nextDouble();
        System.out.printf("Amout to be paid in reais = R$%.2f%n",CurrencyConverter.calc());
    }
    
}
