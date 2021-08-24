package classwork.lab5.employees;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSorter {
    public static List<Employee> sortBySalary(List<Employee> list) {
        return list.stream()
                .sorted((t1, t2) -> t2.getSalary() - t1.getSalary())
                .collect(Collectors.toList());
    }

    public static Map<String , Employee> highestSalaryByName(List<Employee> list) {
        return list.stream()
                .collect(Collectors.toMap(Employee::getName,
                        employee -> employee,
                        (employee, employee2) -> employee.getSalary() > employee2.getSalary() ? employee : employee2));
    }

    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee("A", 20),
                new Employee("B", 30),
                new Employee("C", 10),
                new Employee("D", 40),
                new Employee("C", 15));
        for (Employee employee: sortBySalary(list)) {
            System.out.println(employee.getName() + " " + employee.getName());
        }
        for (Map.Entry<String, Employee> entry: highestSalaryByName(list).entrySet()) {
            System.out.println("Name = " + entry.getKey() + ", Salary = " + entry.getValue().getSalary());
        }
    }
}
