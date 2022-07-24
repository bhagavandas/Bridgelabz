package com.EmployeeWage;

public class EmpPageBuilderUC5 {
	static final int IS_FULLTIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_RATE_PER_HR = 20;
	static final int No_of_Working_Days = 20;

	public static void main(String[] args) {
		int emp_hrs = 0;
		int empwage = 0;
		int total_emp_wage = 0;
		for (int day = 0; day < No_of_Working_Days; day++) {
			int empAttendance = (int) Math.floor(Math.random() * 10 % 3);
			switch (empAttendance) {
			case IS_PART_TIME:
				emp_hrs = 4;
				break;
			case IS_FULLTIME:
				emp_hrs = 8;
				break;
			default:
				emp_hrs = 0;
			}
			empwage = emp_hrs * EMP_RATE_PER_HR;
			total_emp_wage += empwage;
			System.out.println("Emp Wage : " + empwage);
		}
		System.out.println("Total Emp Wage : " + total_emp_wage);
	}
}
