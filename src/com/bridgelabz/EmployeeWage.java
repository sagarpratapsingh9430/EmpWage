package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int EMPLOYEE_RATE_PER_HOUR = 20;
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;

        int employeeHours = 0;
        int employeeWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case 0:
                employeeHours = 0;
                break;
            case 1:
                employeeHours = 4;
                break;
            case 2:
                employeeHours = 8;
                break;
            default:
                System.out.println("Invalid choice");
        }
        employeeWage = employeeHours * EMPLOYEE_RATE_PER_HOUR;
        System.out.println(employeeWage);
    }
}
