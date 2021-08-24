package com.employeewage;

public class EmployeeMain {
	
	// Constants
			public static final int IS_PART_TIME = 1;
			public static final int IS_FULL_TIME = 2;
			public static final int EMP_RATE_PER_HOUR = 20;
			public static final int NUM_WORKING_DAYS = 20;


	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Computation program");
		//local variables
		int Emp_Hrs = 0;
		int Emp_Wage = 0;
		int Total_Wage = 0;

		// Computation
		for(int day = 0;day < NUM_WORKING_DAYS;day++)
		{
			int empCheck=(int) (Math.floor(Math.random()*10)%3);
			switch (empCheck)
			{
			case  IS_FULL_TIME: Emp_Hrs=16;break;
			case IS_PART_TIME: Emp_Hrs=8;break;
			default: Emp_Hrs=0;
			}

			Emp_Wage=Emp_Hrs*EMP_RATE_PER_HOUR ;
			Total_Wage+=Emp_Wage;
			System.out.println("Employee wage is "+Emp_Wage);
		}
		System.out.println("Total wage is "+Total_Wage);
	}

}
