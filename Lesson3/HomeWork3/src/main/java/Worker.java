public class Worker extends Employee {
    private double hourlyRate;

    public Worker(String name, double monthlySalary, double hourlyRate) {
        super(name, monthlySalary);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}