package aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Aluguel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Rent[] rooms = new Rent[10];

        System.out.print("Quantos quartos serão alugados: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.println("Quarto " + i + ": " + rooms[i].name);
                System.out.println(rooms[i].email);
                System.out.println();
            }
        }

        sc.close();


    }
}
