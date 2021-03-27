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

	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "EmployeeStatus [company=" + company + ", empRatePerHr=" + empRatePerHr + ", noOfWorkingDays="
				+ noOfWorkingDays + ", maxHourPerMonth=" + maxHourPerMonth + ", totalEmpWage=" + totalEmpWage + "]";
	}
	public class EmpWageBuilderArray {
		public static final int isPartTime = 1;
		public static final int isFullTime = 2;
		private int noOfCompany = 0;
		private EmployeeStatus[] companyEmpWageArray;

		public EmpWageBuilderArray() {
			companyEmpWageArray = new EmployeeStatus[5];
		}

		public void addCompanyDetailsForEmpWage(String companyName, int empRatePerHr, int numnberOfWorkingDays,
				int maxWorkingHrsPerMonth) {
			companyEmpWageArray[noOfCompany] = new EmployeeStatus(companyName, empRatePerHr, numnberOfWorkingDays,
					maxWorkingHrsPerMonth);
			noOfCompany++;
		}
			private void computeEmpWage() {
				for(int i = 0; i < noOfCompany; i++) {
					companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
					
				}
			}
			
			private int computeEmpWage(EmployeeStatus employeeStatus) {
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
				return totalEmpWage = totalEmpHrs * empRatePerHr;

			}
			EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
	}

	public static void main(String[] args) {

		EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
		//empWageBuilderArray.addCompanyDetailsForEmpWage("D'mart", 20, 4, 15);
		empWageBuilderArray.computeEmpWage();
		
		
	}
}
