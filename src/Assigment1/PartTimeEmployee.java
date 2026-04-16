package Assigment1;

// PartTimeEmployee class
public class PartTimeEmployee extends Employee implements Taxable {

    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(int employeeId, int hoursWorked, double hourlyRate) {
        super(employeeId, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        double gross = hoursWorked * hourlyRate;
        return gross - calculateTax();
    }

    @Override
    public double calculateTax() {
        return (hoursWorked * hourlyRate) * 0.05; // 5% tax
    }
}
