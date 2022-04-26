package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    // Variable initialization
    static int attendance;
    static  int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        // creating object of class
        EmployeeWageComputation ew=new EmployeeWageComputation();
        int workingHrs = 0;
        // creating oject of random class
        Random random = new Random();
        //generate random no using random() function
        attendance = (int) Math.floor(Math.random() * 10) % 3;
        if (attendance == 0){
            System.out.println("Employee is absent");
            workingHrs = 0;
        }
        else if (attendance == 1){
            System.out.println("Employee working as part-time");
            workingHrs = 4;
        }
        else{
            System.out.println("Employee working as full time");
            workingHrs = 8;
        }
        int dailyWage = workingHrs * WAGE_PER_HOUR;
        System.out.println("Daily wage is " + dailyWage);
    }
}