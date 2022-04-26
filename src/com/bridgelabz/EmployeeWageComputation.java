package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    // Variable initialization
    static int attendance;
    static int wage_per_hr=20;
    static int work_per_HR=8;

    public static void main(String[] args) {
        // creating object of class
        EmployeeWageComputation ew=new EmployeeWageComputation();

        // creating oject of random class
        Random random = new Random();
        //generate random no using random() function
        attendance  = random.nextInt(3);
        int dailyWage =attendance * wage_per_hr * work_per_HR;
        //Check if employee is present
        if (attendance == 1)
            System.out.println("Employee is present and Daily Wage Is " + dailyWage);
        else
            System.out.println("Employee is Absent and Daily Wage Is " + dailyWage);
       
    }
}