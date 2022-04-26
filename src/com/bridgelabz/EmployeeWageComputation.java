package com.bridgelabz;
import java.util.Random;
public class EmployeeWageComputation
{
    // Variable initialization
    static int attendance;
    static  int WAGE_PER_HOUR = 20;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HRS = 100;

    public void totalWageCalculation()
    {
     // local variable initialization
        int workingHrs = 0;
        int monthlyWages = 0;
        int totalWorkingHrs=0;

        // creating oject of random class
        Random random = new Random();

        //generate random no using random() function
        for (int i = 1; i<= MAX_WORKING_DAYS && totalWorkingHrs<MAX_WORKING_HRS ;i++)
        {
            //Calculating Total Working Hrs
            totalWorkingHrs=totalWorkingHrs+workingHrs;
            int dailyWage = 0;
            attendance  = random.nextInt(3);
            switch (attendance)
            {

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

           //Calculating Daily Wage
            dailyWage = workingHrs * WAGE_PER_HOUR;
            System.out.println("Daily wage is " + dailyWage);

            //Calculating Monthly Wage
            monthlyWages = monthlyWages + dailyWage;

            System.out.println("day=>"+i+"\t working hrs =>"+workingHrs+"\t Daily wage="+dailyWage+"\t Total working Hrs"+totalWorkingHrs);
        }
        System.out.println("Monthly Wages:: "+monthlyWages);

    }
}

    public static void main(String[] args)
    {
        // creating object of class
        EmployeeWageComputation ew=new EmployeeWageComputation();

        //calling totalWageCalculation() method using class object
        ew.totalWageCalculation();
    }
}