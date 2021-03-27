package com.bridelabz;

public class EmployeeStatus {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHrs = 20;

	public static final int No_Of_Working_Days = 2;

	public static void main(String[] args) {
		int empWage = 0;
		int empHrs = 0;
		int totalEmpWage = 0;

		for (int days = 0; days < No_Of_Working_Days; days++) {
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
			empWage = empHrs * empRatePerHrs;
			totalEmpWage += empWage;
			System.out.println("Emp Wage" + " " + empWage);
		}
		System.out.println("totalEmpWage" + " " + totalEmpWage);

	}
}
