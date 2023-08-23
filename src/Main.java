import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Employee.setNumOfEmployee(8);
        Employee.addEmployee(new Employee("Tom", 23, 2345));
        Employee.addEmployee (new Employee("Dan", 26, 2876));
        Employee.addEmployee (new Employee("Bob", 35, 2545));
        Employee.addEmployee (new Employee("Jon", 34, 2745));
        Employee.addEmployee (new Employee("Rob", 44, 3345));
        Employee.addEmployee (new Employee("Ann", 32, 3245));
        Employee.addEmployee (new Employee("Fox", 41, 2925));
        Employee.addEmployee (new Employee("Liz", 21, 1945));
        Arrays.stream(Employee.employee).forEach(System.out::println);
        System.out.println();
        Company company = new Company(Employee.employee);
        Arrays.stream(company.employees)
                .sorted()
                .forEach(System.out::println);
        System.out.println();
        Arrays.stream(company.employees)
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .forEach(System.out::println);
        System.out.println();
        Arrays.stream(company.employees)
                .sorted((o1,o2) -> o2.getSalary() - o1.getSalary())
                .forEach(System.out::println);

        System.out.println();

        for (Employee w: company)
            System.out.println(w);

    }
}
