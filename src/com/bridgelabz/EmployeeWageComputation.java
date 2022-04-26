package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    // Variable initialization
    static int attendance;

    public static void main(String[] args) {
        // creating object of class
        EmployeeWageComputation ew=new EmployeeWageComputation();

        // creating oject of random class
        Random random = new Random();
        //generate random no using random() function
        attendance  = random.nextInt(2);
        //Check if employee is present
        if (attendance == 1)
            System.out.println("Employee is present.");
        else
            System.out.println("Employee is absent.");

    }
}