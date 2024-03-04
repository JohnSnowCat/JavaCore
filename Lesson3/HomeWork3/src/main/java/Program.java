import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        EmployeeCollection employeeCollection = new EmployeeCollection();
        employeeCollection.addEmployee(new Worker("John", 1000, 10));
        employeeCollection.addEmployee(new Freelancer("Jane", 2000, 20, 100));
        employeeCollection.addEmployee(new Worker("Bob", 1500, 15));
        employeeCollection.addEmployee(new Freelancer("Alice", 3000, 25, 150));

        System.out.println("Before sorting:");
        employeeCollection.printEmployees();

        System.out.println("\nAfter sorting by average monthly salary:");
        employeeCollection.sortEmployees();
        employeeCollection.printEmployees();

        System.out.println("\nAfter sorting by name:");
        employeeCollection.sortEmployees(Comparator.comparing(Employee::getName));
        employeeCollection.printEmployees();

        System.out.println("\nAfter sorting by salary using custom comparator:");
        employeeCollection.sortEmployees(new SalaryComparator());
        employeeCollection.printEmployees();
    }
}
