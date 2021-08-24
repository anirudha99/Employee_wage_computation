package com.employeewage;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Computation program");
		// Constants
				final int IS_FULL_TIME =1;
				
				// Computation
				double empCheck=Math.floor(Math.random()*10)%2;
				if (empCheck==IS_FULL_TIME)
					System.out.println("Employee is present");
				else
					System.out.println("Employee is absent");
	}

}
