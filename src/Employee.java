import java.util.Comparator;


public class Employee implements Comparable<Employee> {
    private final String name;
    private final int age;
    private final int salary;
    public static Employee[] employee;
    private static int count = 0;


    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }


    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public static void setNumOfEmployee(int numOfEmployee) {
        employee = new Employee[numOfEmployee];
    }

    public static void addEmployee(Employee e) {
        if (count < employee.length)
            employee[count++] = e;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return age - o.getAge();
    }

    private static class EmployeeSalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary() - o2.getSalary();
        }
    }
}

