package altura;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1 +"a pessoa"));

            System.out.print("Nome: ");
            name[i] = sc.next();

            System.out.print("Idade: ");
            age[i] = sc.nextInt();

            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i =0; i<n; i++) {
            soma = soma + height[i];
        }

        double mediaAlturas = soma / n;
        System.out.println();
        System.out.printf("Altura Média: %.2f%n", mediaAlturas);

        int cont=0;
        for(int i = 0; i < n; i++) {
            if (age[i] < 16){
                cont = cont + 1;

            }
        }

        double percent = cont * 100.0 / n;
        System.out.printf("A porcentagem de pessoas com menos de 16 anos é de: %.1f%%%n",  percent );

        for(int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }



        sc.close();
    }
}
