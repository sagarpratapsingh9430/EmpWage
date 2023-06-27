package com.bridgelabz;

public class Method {
    public static void main(String[] args) {
        Company company1 =new Company();
        company1.employeeWage(5,10,20,150,25);
        System.out.println("For company 1: ");
        System.out.println();
        
        System.out.println("*********************************");
        System.out.println();
        Company company2 = new Company();
        company2.employeeWage(6,12,25,200,30);
        System.out.println("For company 2: ");
    }
}
