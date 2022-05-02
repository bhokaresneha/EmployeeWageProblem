package com.bridgelabz;
import java.util.Random;
public class EmployeeWageComputation
{
    // Variable initialization
    public static int wagePerHr;
    public static int maxWorkingDays;
    public static  String companyName;
     int maxWorkingHrs=100;
    static int attendance;
    EmployeeWageComputation(String companyName,int wagePerHr,int maxWorkingDays,int maxWorkingHour){
        this.companyName=companyName;
        this.wagePerHr = wagePerHr;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHrs = maxWorkingHour;
    }
    public void totalWageCalculation()
    {

        //local variable initialization
        int monthlyWages = 0;
        int totalWorkingHrs=0;
        int workingHrs = 0;

        //Displaying data passed to totalWageCalculation() Method
        System.out.println("Data of " + companyName + " employee");
        System.err.println("Wage per hour:" + wagePerHr);
        System.out.println("Maximum working days:" + maxWorkingDays);
        System.out.println("Maximum working hours:" + maxWorkingHrs);
        System.out.println("Company Name =>"+companyName+"\t Wage per hour =>"+wagePerHr+"\t Maximum working days =>"+maxWorkingDays+"\t Maximum working hours"+maxWorkingHrs);

        // creating object of Random() class
        Random random = new Random();

        //generate random no using random() function
        for (int i = 1; i<= maxWorkingDays && totalWorkingHrs<maxWorkingHrs ;i++)
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
            dailyWage = workingHrs * wagePerHr;
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
        EmployeeWageComputation amazon = new EmployeeWageComputation("Amazon", 40, 15, 200 );
        //calculateTotalWage Using object amazon
        amazon.totalWageCalculation();
        System.out.println(amazon);

        EmployeeWageComputation ibm = new EmployeeWageComputation("IBM", 20, 20, 100);

        //calculateTotalWage Using object ibm
        ibm.totalWageCalculation();
        //Passing values to the totalWageCalculation()Method




    }
}