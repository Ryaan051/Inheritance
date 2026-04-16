package Assigment1;

// Main class (Demo)
public class PayrollSystem {
    public static void main(String[] args) {

        // Full-time employee
        FullTimeEmployee emp1 = new FullTimeEmployee(1, 1000);

        // Part-time employee
        PartTimeEmployee emp2 = new PartTimeEmployee(2, 40, 10);

        System.out.println("Full-Time Employee Salary: " + emp1.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + emp2.calculateSalary());
    }
}
