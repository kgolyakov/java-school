package classwork.lab5.employees;

public class Employee {
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    private int salary;
    private String name;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
