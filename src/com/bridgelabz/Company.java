package com.bridgelabz;

public class Company {
  //  static final int EMPLOYEE_RATE_PER_HOUR = 20;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
  //  static final int TOTAL_WORKING_DAYS = 20;
  //  static final int TOTAL_WORKING_HOURS = 100;
    public void employeeWage(int PART_DAY_HOUR,int FULL_DAY_HOUR,int TOTAL_WORKING_DAYS,int TOTAL_WORKING_HOURS,int EMPLOYEE_RATE_PER_HOUR) {

        int employeeTotalWage = 0;
        int employeeHours = 0;

        int day = 1;
        int workingHour = 0;

        while (day <= TOTAL_WORKING_DAYS && workingHour <= TOTAL_WORKING_HOURS){
            int employeeWage = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0:
                    employeeHours = 0;
                    break;
                case 1:
                    employeeHours = PART_DAY_HOUR;
                    break;
                case 2:
                    employeeHours = FULL_DAY_HOUR;
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
            if(workingHour>TOTAL_WORKING_HOURS){
                workingHour=TOTAL_WORKING_HOURS;
                employeeTotalWage=workingHour*EMPLOYEE_RATE_PER_HOUR;
            }
        }

        System.out.println("Total employee wage after " +TOTAL_WORKING_DAYS+ " days or " + TOTAL_WORKING_HOURS +" hours: " + employeeTotalWage);
    }
}
