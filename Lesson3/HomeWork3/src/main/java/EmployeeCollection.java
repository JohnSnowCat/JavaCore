import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCollection {
    private List<Employee> employees;

    public EmployeeCollection() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortEmployees() {
        Collections.sort(employees);
    }

    public void sortEmployees(Comparator<Employee> comparator) {
        Collections.sort(employees, comparator);
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.calculateAverageMonthlySalary());
        }
    }
}
