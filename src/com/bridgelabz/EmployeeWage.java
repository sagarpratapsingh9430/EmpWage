package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {

        double empCheck = Math.floor(Math.random()*10)%2;

        if (empCheck == 1){
            System.out.println("Present");
        }else {
            System.out.println("Absent");
        }
       
    }
}
