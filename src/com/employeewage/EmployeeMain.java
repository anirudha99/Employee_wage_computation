package com.employeewage;

public class EmployeeMain {

	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public final int EMP_RATE_PER_HOUR;
	public final int NUM_WORKING_DAYS;
	public final int MAX_HRS_IN_MONTH;
	public final String company;


	/**
	 * @param company
	 * @param EMP_RATE_PER_HOUR
	 * @param NUM_WORKING_DAYS
	 * @param MAX_HRS_IN_MONTH
	 * Parameterised constructor
	 */
	public EmployeeMain(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
	{
		this.company=company;
		this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;

	}

	//method to check attendance and calculate wage
	public void wageAttendance() {
		//variables
		int Emp_Hrs = 0;
		int Emp_Wage = 0;
		int Total_Wage = 0;
		int TotalEmpHrs = 0;
		int TotalWorkingDays = 0;

		while(TotalEmpHrs<MAX_HRS_IN_MONTH && TotalWorkingDays<NUM_WORKING_DAYS) {
			int empCheck=(int) (Math.floor(Math.random()*10)%3); //random number for attendance
			TotalWorkingDays+=1;
			switch (empCheck) //To check if full time or part time worker
			{
			case  IS_FULL_TIME:
				Emp_Hrs=16;
				break;
			case IS_PART_TIME:
				Emp_Hrs=8;
				break;
			default: Emp_Hrs=0;
			}
			TotalEmpHrs+=Emp_Hrs; //calculation
			Emp_Wage = Emp_Hrs*EMP_RATE_PER_HOUR ;
			Total_Wage+=Emp_Wage;
			System.out.println("Employee wage of the company - "+company+  " is :"+ Emp_Wage);
		}
		System.out.println("Total wage is "+ Total_Wage);
		System.out.println("Total working hours is "+ TotalEmpHrs);
		System.out.println("Total working days is "+ TotalWorkingDays);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation program");

		EmployeeMain more = new EmployeeMain("More",20,20,100); //multiple object creation for different companies
		EmployeeMain bigbazaar = new EmployeeMain("BigBazaar",22,20,105);
		EmployeeMain dmart = new EmployeeMain("DMart",25,22,100);
		more.wageAttendance();
		bigbazaar.wageAttendance();
		dmart.wageAttendance();
	}
}
