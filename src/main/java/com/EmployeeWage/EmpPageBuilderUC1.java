package com.EmployeeWage;

public class EmpPageBuilderUC1 {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int IS_FULLTIME = 1;
		double empAttendance = Math.floor(Math.random()*10%2);
		if(empAttendance == IS_FULLTIME)
			System.out.println("Emp is Present");
		else
			System.out.println("Emp is Absent");
		
		
		
	}
}
