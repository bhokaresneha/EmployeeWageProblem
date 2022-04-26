package com.bridgelabz;
import java.util.Random;
public class EmployeeWageComputation
{
    // Variable initialization
    static int attendance;
    //static  int WAGE_PER_HOUR = 20;
    //static final int MAX_WORKING_DAYS = 20;
    //static final int MAX_WORKING_HRS = 100;

    public void totalWageCalculation(String companyName,int wagePerHour,int maxWorkingDays,int maxWorkingHour)
    {

        //local variable initialization
        int monthlyWages = 0;
        int totalWorkingHrs=0;
        int workingHrs = 0;

        //Displaying data passed to totalWageCalculation() Method
        System.out.println("Data of " + companyName + " employee");
        System.err.println("Wage per hour:" + wagePerHour);
        System.out.println("Maximum working days:" + maxWorkingDays);
        System.out.println("Maximum working hours:" + maxWorkingHour);
        System.out.println("Company Name =>"+companyName+"\t Wage per hour =>"+wagePerHour+"\t Maximum working days =>"+maxWorkingDays+"\t Maximum working hours"+maxWorkingHour);

        // creating object of Random() class
        Random random = new Random();

        //generate random no using random() function
        for (int i = 1; i<= maxWorkingDays && totalWorkingHrs<maxWorkingHour ;i++)
        {
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
            dailyWage = workingHrs * wagePerHour;
            System.out.println("Daily wage is " + dailyWage);

            //Calculating Monthly Wage
            monthlyWages = monthlyWages + dailyWage;

            System.out.println("day=>"+i+"\t working hrs =>"+workingHrs+"\t Daily wage="+dailyWage+"\t Total working Hrs"+totalWorkingHrs);
        }
        System.out.println("Employees Monthly Wage of Company "+companyName+"is:: "+monthlyWages);

    }

    public static void main(String[] args)
    {
        // creating object of class
        EmployeeWageComputation ew=new EmployeeWageComputation();

        //Passing values to the totalWageCalculation()Method
        ew.totalWageCalculation("Amazon",20,30,100);
        ew.totalWageCalculation("Flipkart",40,20,100);
        ew.totalWageCalculation("BigBazaar", 60, 25, 100);

    }
}