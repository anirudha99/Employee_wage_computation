package com.employeewage;

public class CompanyEmpWage {
	public final int empWagePerHour;
	public final int numWorkingDays;
	public final int maxHoursInMonth;
	public final String company;
	public int dailyWage;
	
	
	/**
	 * @return daily wage
	 */
	public int getDailyWage() {
		return dailyWage;
	}

	/**
	 * @param dailyWage
	 */
	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}

	public int Total_Wage;
	
	/**
	 * @return total wage
	 */
	public int getTotal_Wage() {
		return Total_Wage;
	}

	/**
	 * @param total_Wage
	 */
	public void setTotal_Wage(int total_Wage) {
		Total_Wage = total_Wage;
	}

	
	@Override
	public String toString() {
		return "CompanyEmpWage [Company = " + company + ", TotalWage = " + Total_Wage + "]";
	}

	/**
	 * @param company
	 * @param empWagePerHour
	 * @param numWorkingDays
	 * @param maxHoursInMonth
	 */
	public CompanyEmpWage(String company,int empWagePerHour,int numWorkingDays,int maxHoursInMonth)
	{
		this.company=company;
		this.empWagePerHour = empWagePerHour;
		this.numWorkingDays = numWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;

	}


}
