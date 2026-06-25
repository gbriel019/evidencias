import java.util.Locale;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos produtos você armazenar? ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];


        for(int i=0; i< vect.length; i++) {
            System.out.println("Digite o nome do produto: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }
        double sum = 0;
        for(int i= 0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("MÉDIA DOS PRODUTOS = %.2f%n", + avg);


        sc.close();
    }
}



