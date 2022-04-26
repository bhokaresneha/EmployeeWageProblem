package com.bridgelabz;
import java.util.Random;
public class EmployeeWageComputation {
    // Variable initialization
    static int attendance;
    static  int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        // creating object of class
        int workingHrs = 0;
        // creating oject of random class
        Random random = new Random();
        //generate random no using random() function
        attendance  = random.nextInt(3);
        switch (attendance){
            case 0 :
                workingHrs = 0;
                System.out.println("Employee is absent");
                break;
            case 1 :
                workingHrs = 4;
                System.out.println("Employee working as part-time");
                break;
            case 2 :
                workingHrs = 8;
                System.out.println("Employee working as full time");
                break;
        }
        int dailyWage = workingHrs * WAGE_PER_HOUR;
        System.out.println("Daily wage is " + dailyWage);
    }
}