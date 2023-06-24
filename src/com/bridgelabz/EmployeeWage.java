package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        double empCheck = Math.floor(Math.random()*10)%2;
        System.out.println("Welcome to employee wage");
        
        if (empCheck == 1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is absent");
        }
    }
}
