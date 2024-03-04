import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.calculateAverageMonthlySalary(), o2.calculateAverageMonthlySalary());
    }
}
