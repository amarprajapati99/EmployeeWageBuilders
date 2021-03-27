package com.bridelabz;

public class EmployeeStatus {

	public static void main(String[] args) {
		
		System.out.println("Welcome employee wage builder program");
		
		int isPartTime=1;
		int isFullTime = 2;
		
		int empRatePerHrs = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == isFullTime) 
			empHrs = 8;
		else if(empCheck==isPartTime)
			empHrs = 4;
		 else 
			empHrs = 0;
			empWage = empHrs * empRatePerHrs;
			System.out.println("EmpWage :" + " " + empWage);
		

	}

}
