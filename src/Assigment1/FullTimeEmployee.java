package Assigment1;

// FullTimeEmployee class
public class FullTimeEmployee extends Employee implements Taxable, BonusEligible {

    public FullTimeEmployee(int employeeId, double salary) {
        super(employeeId, salary);
    }

    @Override
    double calculateSalary() {
        return salary + calculateBonus() - calculateTax();
    }

    @Override
    public double calculateTax() {
        return salary * 0.10; // 10% tax
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }
}

