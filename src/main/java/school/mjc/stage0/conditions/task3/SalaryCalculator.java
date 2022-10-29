package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryAfterTaxis;
        if (salary <= 10000 && salary >= 0) {
            salaryAfterTaxis = salary * 0.85;
            System.out.println(salaryAfterTaxis);
        } else if (salary > 10000 && salary <= 20000) {
            salaryAfterTaxis = salary * 0.82;
            System.out.println(salaryAfterTaxis);
        } else if (salary > 20000) {
            salaryAfterTaxis = salary * 0.8;
            System.out.println(salaryAfterTaxis);
        } else System.out.println("wrong input!");
    }
}
