package com.employeewage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anirudhasm Class to compute wage, attendance of employee belonging to particular company
 * with wager per hour for that company
 *
 */
public class EmployeeMain implements ComputeEmpWage {

	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private List<CompanyEmpWage> companyempwage; // List

	EmployeeMain(){
		companyempwage = new ArrayList<>();
	}

	/**
	 * @param company
	 * @param empWagePerHour
	 * @param maxHoursPerMonth
	 * @param numWorkingDays
	 * To add company
	 */
	@Override
	public void addCompanyEmpWage(String company, int empWagePerHour, int maxHoursPerMonth, int numWorkingDays) {
		CompanyEmpWage companyempWage = new CompanyEmpWage(company, empWagePerHour, maxHoursPerMonth, numWorkingDays);
		companyempwage.add(companyempWage);
	}

	//method to check attendance and calculate wage
	@Override
	public void wageAttendance() {
		for (CompanyEmpWage company : companyempwage) {

			int totalEmpHours, totalWorkingDays, empHours;
			totalEmpHours = totalWorkingDays = empHours = 0;


			while(totalEmpHours < company.maxHoursInMonth && totalWorkingDays < company.numWorkingDays) {
				int empCheck=(int) (Math.floor(Math.random()*10)%3); //random number for attendance
				totalWorkingDays+=1;
				switch (empCheck) //To check if full time or part time worker
				{
				case  IS_FULL_TIME:
					empHours = 16;
					break;
				case IS_PART_TIME:
					empHours = 8;
					break;
				default: empHours = 0;
				}
				totalEmpHours += empHours; //calculation
				System.out.println("Day::" + totalWorkingDays + " Emp hour - " + empHours);

			}
			company.setTotal_Wage(totalEmpHours * company.empWagePerHour);
			System.out.println(company);

		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation program");

		ComputeEmpWage employeeWageBuilder = new EmployeeMain();

		employeeWageBuilder.addCompanyEmpWage("More", 20 , 100 , 20 );
		employeeWageBuilder.addCompanyEmpWage("BigBazaar", 22 , 95 , 20 );

		employeeWageBuilder.wageAttendance();

	}
}
