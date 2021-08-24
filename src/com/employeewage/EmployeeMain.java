package com.employeewage;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Computation program");
		
		// Constants
		final int IS_PART_TIME =1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		
		//local variables
		int Emp_Hrs = 0;
		int Emp_Wage = 0;
		
		// Computation
		int empCheck=(int) (Math.floor(Math.random()*10)%3);
		switch (empCheck) {
		case  IS_FULL_TIME: Emp_Hrs=16;break;
		case IS_PART_TIME: Emp_Hrs=8;break;
		default: Emp_Hrs=0;
		}
		
		Emp_Wage=Emp_Hrs*EMP_RATE_PER_HOUR ;
				
		System.out.println("Employee wage is "+Emp_Wage);
	}

}
