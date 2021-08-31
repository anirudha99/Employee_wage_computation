package com.employeewage;

public class EmployeeMain {

	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH=100;

	//variables
	int Emp_Hrs = 0;
	int Emp_Wage = 0;
	int Total_Wage = 0;
	int TotalEmpHrs=0;
	int TotalWorkingDays=0;

	//method to calculate wage
	public void getWage() {
		Emp_Wage=Emp_Hrs*EMP_RATE_PER_HOUR ;
		Total_Wage+=Emp_Wage;
		TotalWorkingDays+=1;
		System.out.println("Employee wage is "+Emp_Wage);
	}

	//method to check attendance
	public void empAttendance() {
		int empCheck=(int) (Math.floor(Math.random()*10)%3);
		switch (empCheck)
		{
		case  IS_FULL_TIME:
			System.out.println("Fulltime worker");
			Emp_Hrs=16;
			TotalWorkingDays+=1;
			break;
		case IS_PART_TIME:
			System.out.println("Part-time worker");
			Emp_Hrs=8;
			TotalWorkingDays+=1;
			break;
		default: Emp_Hrs=0;
		}
		TotalEmpHrs+=Emp_Hrs;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation program");
		EmployeeMain employee = new EmployeeMain();

		while(employee.TotalEmpHrs<MAX_HRS_IN_MONTH && employee.TotalWorkingDays<NUM_WORKING_DAYS) {
			employee.empAttendance();
			employee.getWage();
		}
		System.out.println("Total wage is "+employee.Total_Wage);
		System.out.println("Total working hours is "+employee.TotalEmpHrs);
		System.out.println("Total working days is "+employee.TotalWorkingDays);
	}

}
