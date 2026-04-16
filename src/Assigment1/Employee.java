package Assigment1;
// Interface Taxable
interface Taxable {
    double calculateTax();
}

// Interface BonusEligible
interface BonusEligible {
    double calculateBonus();
}

// Abstract class Employee
public abstract class Employee {
    int employeeId;
    double salary;

    // Constructor
    public Employee(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Abstract method
    abstract double calculateSalary();
}

