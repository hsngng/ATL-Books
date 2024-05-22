package com.company.training;

public class Employee {
    private String name;
    public double salary;
    private int workHours, hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double Tax() {
        if (this.salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }

    public double Bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours>0){
            return 30 * extraHours;
        }
        return 0.0;
    }

    public double increase() {
        int year = 2024 - hireYear;
        if (year < 10) {
            return salary * 0.5;
        } else if (year >= 10 && year < 20) {
            return salary * 0.10;
        }else {
            return salary * 0.15;
        }
    }
    public void toString(Employee m){
        System.out.println("Tax: "+ m.Tax());
        System.out.println("Bonus: "+ m.Bonus());
        System.out.println("Increase Salary :" + m.increase());
        double totalSalary = m.salary - m.Tax() + m.Bonus();
        System.out.println("Total :" + totalSalary);
        System.out.println("Total Incr:" + (m.salary + m.increase()));
    }
}
