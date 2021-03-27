package com.bridelabz;

public class EmployeeStatus {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	private final String company;
	private final int empRatePerHr;
	private final int noOfWorkingDays;
	private final int maxHourPerMonth;
	private int totalEmpWage;
	

	public EmployeeStatus(String company, int empRatePerHr, int noOfWorkingDays, int maxHourPerMonth) {
		super();
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHourPerMonth = maxHourPerMonth;
	}

	public void computeEmpWage() {
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays <= noOfWorkingDays) {
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
		totalEmpWage = totalEmpHrs * empRatePerHr;
		
	}
	

	@Override
	public String toString() {
		return "EmployeeStatus [company=" + company + ", empRatePerHr=" + empRatePerHr + ", noOfWorkingDays="
				+ noOfWorkingDays + ", maxHourPerMonth=" + maxHourPerMonth + ", totalEmpWage=" + totalEmpWage + "]";
	}

	public static void main(String[] args) {
		EmployeeStatus dmart = new EmployeeStatus("Dmart", 20, 10, 2);
		EmployeeStatus reliance = new EmployeeStatus("Reliance", 40, 10, 2);
		System.out.println(dmart);
		System.out.println(reliance);

	}
}
