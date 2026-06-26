package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Digite o número de Linhas: ");
        int m = sc.nextInt();
        System.out.print("Digite o número de Colunas: ");
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        System.out.println("Digite a sua matriz: ");
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("Digite o número que quer buscar os números vizinhos: ");
        int x = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i - 1][j]);
                    }
                    if (i < m - 1) {
                        System.out.println("Baixo: " + mat[i + 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (j < n) {
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }


                }
            }
        }
        sc.close();
    }
}
