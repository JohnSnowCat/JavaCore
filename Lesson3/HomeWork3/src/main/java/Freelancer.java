public class Freelancer extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String name, double monthlySalary, double hourlyRate, double hoursWorked) {
        super(name, monthlySalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return hourlyRate * hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
