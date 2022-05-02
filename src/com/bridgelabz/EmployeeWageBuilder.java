package com.bridgelabz;

import java.util.Random;

interface IEmployeeWageComputation
{
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);

    public void calculateTotalWage();
}


public class EmployeeWageBuilder implements IEmployeeWageComputation
{
    // instance variables
    int noOfCompanies, index;
    CompanyEmpWage[] companies;
    Random random= new Random();
    public EmployeeWageBuilder(int noOfCompanies)
    {
        this.noOfCompanies = noOfCompanies;
        companies = new CompanyEmpWage[noOfCompanies];
        index = 0;
    }

    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        companies[index++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
    }



    public void calculateTotalWage()
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
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        return totalWage;
    }

    public static void main(String args[])
    {
        EmployeeWageBuilder employeewaagecomputation = new EmployeeWageBuilder(3);
        employeewaagecomputation.addCompany("TCS", 4, 30, 100);
        employeewaagecomputation.addCompany("Bridgelabz", 5, 40, 170);
        employeewaagecomputation.addCompany("Wipro", 9, 10, 70);
        employeewaagecomputation.calculateTotalWage();
    }
}
