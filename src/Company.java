import java.util.Iterator;


public class Company implements Iterable<Employee> {
    public  Employee [] employees;

    public Company (Employee [] employees){
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new CompanyIterator(employees);
    }
    public static class CompanyIterator implements Iterator<Employee>{
        private int count = 0;
        private final Employee[] employees;

        public CompanyIterator(Employee[] employees) {
            this.employees = employees;
        }

        @Override
        public boolean hasNext() {
            return count < employees.length;
        }

        @Override
        public Employee next() {
            return employees[count++];
        }
    }
}

