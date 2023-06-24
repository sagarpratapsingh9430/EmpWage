package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int EMPLOYEE_RATE_PER_HOUR = 20;
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;

        int employeeHours = 0;
        int employeeWage = 0;
        double empCheck = Math.floor(Math.random()*10)%3;

        if (empCheck == IS_PART_TIME){
            employeeHours = 4;
        }else if (empCheck == IS_FULL_TIME){
            employeeHours = 8;
        }else{
            employeeHours = 0;
        }
        employeeWage = employeeHours * EMPLOYEE_RATE_PER_HOUR;
        System.out.println(employeeWage);
    }
}
