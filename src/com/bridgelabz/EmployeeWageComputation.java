package com.bridgelabz;
import java.util.Random;
public class EmployeeWageComputation {
    // Variable initialization
    static int attendance;
    static  int WAGE_PER_HOUR = 20;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        // creating object of class
        EmployeeWageComputation ew=new EmployeeWageComputation();
        int workingHrs = 0;
        int monthlyWages = 0;
        // creating oject of random class
        Random random = new Random();
        //generate random no using random() function
        for (int i = 1; i<= WORKING_DAYS_PER_MONTH;i++){
            int dailyWage = 0;
            attendance = (int) Math.floor(Math.random() * 10) % 3;
            switch (attendance) {
                case 0:
                    workingHrs = 0;
                    System.out.println("Employee is absent");
                    break;
                case 1:
                    workingHrs = 4;
                    System.out.println("Employee working as part-time");
                    break;
                case 2:
                    workingHrs = 8;
                    System.out.println("Employee working as full time");
                    break;
            }
            dailyWage = workingHrs * WAGE_PER_HOUR;
            System.out.println("Daily wage is " + dailyWage);
            monthlyWages = monthlyWages + dailyWage;
        }
        System.out.println("Monthly Wages:: "+monthlyWages);
    }
}