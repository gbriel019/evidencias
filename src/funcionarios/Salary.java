package funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employers> list = new ArrayList<>();

        System.out.print("Quantos funcionarios serão registrados: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.print("Esse ID já existe, digite outro: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salary = sc.nextDouble();

            Employers emp = new Employers(id, name, salary);
            list.add(emp);
        }
        System.out.println();
        System.out.println("Digite o ID para aumento: ");
        Integer id = sc.nextInt();
        Employers emp = list.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
        if (emp != null) {
            System.out.println();
            System.out.println("Porcentagem que deseja acrescentar: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        } else {
            System.out.println();
            System.out.println("ID não encontrado");
        }
        System.out.println();
        System.out.println("Lista Atualizada: ");

        for (Employers e : list) {
            System.out.println(e);
        }

    }
    public static boolean hasId(List<Employers> list, int id) {
        for (Employers e : list) {
            if (e.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
