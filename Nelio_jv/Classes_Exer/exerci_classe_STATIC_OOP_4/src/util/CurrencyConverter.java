
package util;

public class CurrencyConverter {

    public static double price;
    public static double dollar;
    public static final double iof = 6;

    public static double calc() {
        double a = dollar * price;
        a += a * iof / 100;
        return a;
    }

}
