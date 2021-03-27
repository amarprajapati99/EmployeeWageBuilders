package com.bridelabz;

public class EmployeeStatus {

	public static void main(String[] args) {
		System.out.println("Welcome employee wage builder program");
		int isFullTime = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == 1) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is not absent");
		}

	}

}
