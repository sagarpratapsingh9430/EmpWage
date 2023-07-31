package com.bridgelabz;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public final String company;
    private final int empRatePerHours;
    private final int numOfWorkingDays;
    private final int maxHourPerMonth;

    public EmpWageBuilder(String company, int empRatePerHours, int numOfWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.empRatePerHours = empRatePerHours;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }
    public int calculateEmpWage(){
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs<=maxHourPerMonth && totalWorkingDays <numOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch(empCheck){
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays + ", Emp hrs "+ empHrs);
        }
        System.out.println("Total Emp Hours: "+ totalEmpHrs);
        int totalEmpWage = totalEmpHrs * empRatePerHours;

        return totalEmpWage;
    }
    public static void main(String[] args) {
        EmpWageBuilder dMart = new EmpWageBuilder("DMart",25,23,150);
        EmpWageBuilder bigBasket = new EmpWageBuilder("Big Basket",26,26,100);
        System.out.println("Total Emp Wage for company "+ dMart.company+" is: " +dMart.calculateEmpWage());
        System.out.println();
        System.out.println("Total Emp Wage for company "+ bigBasket.company+" is: " +bigBasket.calculateEmpWage());
    }

}
