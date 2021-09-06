package com.employeewage;

/**
 * @author anirudhasm Class to compute wage, attendance of employee belonging to particular company
 * with wager per hour for that company
 *
 */
public class EmployeeMain implements ComputeEmpWage {

	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;

	private CompanyEmpWage[] companyempwage; // Array

	EmployeeMain(){
		companyempwage = new CompanyEmpWage[5];
	}

	/**
	 * @param company
	 * @param empWagePerHour
	 * @param maxHoursPerMonth
	 * @param numWorkingDays
	 * To add company
	 */
	public void addCompanyEmpWage(String company, int empWagePerHour, int maxHoursPerMonth, int numWorkingDays) {
		companyempwage[numOfCompany] = new CompanyEmpWage(company, empWagePerHour, maxHoursPerMonth, numWorkingDays);
		numOfCompany += 1;
	}

	//method to check attendance and calculate wage
	public void wageAttendance() {
		for (int i = 0; i < numOfCompany; i++) {

			int totalEmpHours, totalWorkingDays, empHours;
			totalEmpHours = totalWorkingDays = empHours = 0;


			while(totalEmpHours < companyempwage[i].maxHoursInMonth && totalWorkingDays < companyempwage[i].numWorkingDays) {
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
			companyempwage[i].setTotal_Wage(totalEmpHours * companyempwage[i].empWagePerHour);
			System.out.println(companyempwage[i]);

		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation program");

		EmployeeMain employeeWageBuilder = new EmployeeMain();

		employeeWageBuilder.addCompanyEmpWage("More", 20 , 100 , 20 );
		employeeWageBuilder.addCompanyEmpWage("BigBazaar", 22 , 95 , 20 );

		employeeWageBuilder.wageAttendance();

	}
}
