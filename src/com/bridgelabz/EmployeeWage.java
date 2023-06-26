package com.bridgelabz;

public class EmployeeWage {
    static final int EMPLOYEE_RATE_PER_HOUR = 20;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int TOTAL_WORKING_DAYS = 20;
    static final int TOTAL_WORKING_HOURS = 100;
    public static void main(String[] args) {

        int employeeTotalWage = 0;
        int employeeHours = 0;
        int employeeWage = 0;
        int day = 1;
        int workingHour = 0;

        while (day <= TOTAL_WORKING_DAYS && workingHour <= TOTAL_WORKING_HOURS){
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
        employeeTotalWage += employeeWage;
        workingHour+=employeeHours;
        System.out.println("Day: " + day);
        System.out.println("Daily employee wage: " + employeeWage);
        System.out.println("Working hour: " + workingHour);
        System.out.println();
        day++;
        }
        System.out.println("Total employee wage after 20 days or 100 hours: " + employeeTotalWage);
    }
}
