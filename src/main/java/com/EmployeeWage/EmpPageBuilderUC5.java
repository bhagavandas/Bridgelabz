package com.EmployeeWage;

public class EmpPageBuilderUC5 {
	static final int IS_FULLTIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_RATE_PER_HR = 20;
	static final int No_of_Working_Days = 2;
	static final int Max_Hrs_In_Month = 100;

	public static void main(String[] args) {
		int Total_emp_hrs = 0;
		int emp_hrs = 0;
		int Total_Working_Days = 0;
		while (Total_emp_hrs <= Max_Hrs_In_Month && Total_Working_Days <= No_of_Working_Days)
			Total_Working_Days++; {
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
		Total_emp_hrs += emp_hrs;
		System.out.println("Emp Days :" + Total_Working_Days + "  Emp Hours :" + emp_hrs);
	}

	int total_empwage = Total_emp_hrs * EMP_RATE_PER_HR;

 System.out.println("Total Emp Wage : "+ total_empwage);
 }
}
