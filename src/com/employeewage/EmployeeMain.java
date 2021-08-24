package com.employeewage;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Computation program");
		
		// Constants
		final int IS_FULL_TIME = 1;
		final int EMP_RATE_PER_HOUR = 20;
		
		//local variables
		int Emp_Hrs=0;
		int Emp_Wage=0;
		
		// Computation
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==IS_FULL_TIME)
			Emp_Hrs = 8;
		Emp_Wage = Emp_Hrs*EMP_RATE_PER_HOUR ;
				
		System.out.println("Employee wage is "+Emp_Wage);
	}

}
