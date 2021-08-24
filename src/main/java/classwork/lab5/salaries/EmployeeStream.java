package classwork.lab5.salaries;

import java.util.List;

public class EmployeeStream {
    static int salarySum(List<Employee> list) {
        return list.stream().map((t1) -> t1.salary).mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee(10), new Employee(20), new Employee(30), new Employee(40));
        System.out.println(salarySum(list));
    }
}
