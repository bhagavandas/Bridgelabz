package com.EmployeeWage;

public class EmpPageBuilderUC2 {
	public static void main(String[] args) {
		
		int IS_FULLTIME = 1;
		int EMP_RATE_PER_HR = 20;
		int emp_hrs=0;
		int empwage =0;
		
		double empAttendance = Math.floor(Math.random()*10%2);
		if(empAttendance == IS_FULLTIME)
			emp_hrs=8;
		else
			emp_hrs=0;
		empwage = emp_hrs * EMP_RATE_PER_HR;
			System.out.println("Daily Emp Wage : " + empwage);
		
		
		
	}
}
