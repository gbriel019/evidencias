package funcionarios;

import java.util.List;

public class Employers {
    private String name;
    private Double salary;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employers(Integer id, String name, Double salary){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return "ID#" + id + ". " + name + ", Salário: $" + String.format("%.3f", salary );
    }




}
