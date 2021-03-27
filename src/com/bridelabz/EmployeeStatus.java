package com.bridelabz;

public class EmployeeStatus {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHrs = 20;
	public static final int maxHrInMonth = 10;

	public static final int noOfWorkingDays = 2;

	public static void main(String[] args) {
		
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= maxHrInMonth && totalWorkingDays <= noOfWorkingDays){
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case isPartTime:
				empHrs = 4;
				break;
			case isFullTime:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			
			totalEmpHrs += empHrs;
			System.out.println("Day : " + " " + totalWorkingDays + "Emphrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHrs;
		System.out.println("total Emp Wage" + " " + totalEmpWage);

	}
}
