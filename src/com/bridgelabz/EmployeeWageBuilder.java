package com.bridgelabz;

import java.util.Random;

public class EmployeeWageBuilder
{

    // instance variables
    int noOfCompanies, index;
    Random random =new Random();
    CompanyEmpWage[] companies;

    public EmployeeWageBuilder(int noOfCompanies)
    {
        this.noOfCompanies = noOfCompanies;
        companies = new CompanyEmpWage[noOfCompanies];
        index = 0;
    }

    void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        companies[index++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
    }


    void calculateTotalWage()
    {
        for (CompanyEmpWage company : companies)
        {
            int totalWage = calculateTotalWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }

    int calculateTotalWage(CompanyEmpWage companyEmpWage)
    {
        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs = 0, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = random.nextInt(3);
            switch (empType)
            {
                case 0:
                    workingHrs = 0;
                    break;
                case 1:
                    workingHrs = 4;
                    break;
                case 2:
                    workingHrs = 8;
                    break;
            }
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("|%5d   |    %5d  |    %5d  |    %5d  |\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        return totalWage;
    }

    public static void main(String args[])
    {
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder(3);
        employeeWageBuilder.addCompany("Microsoft", 4, 30, 100);
        employeeWageBuilder.addCompany("Google", 5, 40, 170);
        employeeWageBuilder.addCompany("Apple", 9, 10, 70);
        employeeWageBuilder.calculateTotalWage();
    }
}
