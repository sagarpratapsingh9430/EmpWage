package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int EMPLOYEE_RATE_PER_HOUR = 20;
        int IS_FULL_TIME = 1;
        int employeeHours = 0;
        int employeeWage = 0;
        double empCheck = Math.floor(Math.random()*10)%2;

        if (empCheck == IS_FULL_TIME){
            employeeHours = 8;
        }else {
            employeeHours = 0;
        }
        employeeWage = employeeHours * EMPLOYEE_RATE_PER_HOUR;
        System.out.println(employeeWage);
    }
}
