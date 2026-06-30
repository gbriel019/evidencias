package dollar;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Convert convert = new Convert();
        System.out.print("What is the dollar price? ");
        convert.valueDollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        convert.quantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f%n", convert.convertDollarToReais());

        sc.close();

    }
}
