public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public abstract double calculateAverageMonthlySalary();

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.calculateAverageMonthlySalary(), o.calculateAverageMonthlySalary());
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}