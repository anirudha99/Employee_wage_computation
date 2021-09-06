package com.employeewage;

/**
 * @author anirudhasm This has declared methods which are implemented in classes
 *
 */
public interface ComputeEmpWageInt {
	public void addCompanyEmpWage(String company, int empWagePerHour, int maxHoursPerMonth, int numWorkingDays);

	public void wageAttendance();
	
	public int getTotalWage(String companyName);

}
