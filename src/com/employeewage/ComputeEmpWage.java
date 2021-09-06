package com.employeewage;

public interface ComputeEmpWage {
	public void addCompanyEmpWage(String company, int empWagePerHour, int maxHoursPerMonth, int numWorkingDays);

	public void wageAttendance();

}
