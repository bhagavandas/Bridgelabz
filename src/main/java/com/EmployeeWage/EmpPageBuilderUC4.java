package com.EmployeeWage;

public class EmpPageBuilderUC4 {

	static final int IS_FULLTIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_RATE_PER_HR = 20;

	public static void main(String[] args) {

		int emp_hrs = 0;
		int empwage = 0;

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
		System.out.println("Emp Wage : " + empwage);

	}
}
