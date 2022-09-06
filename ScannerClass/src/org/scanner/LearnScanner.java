package org.scanner;

import java.util.Scanner;

public class LearnScanner {

	
	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
		System.out.println("Employee ID");
		byte empID = s.nextByte();
		System.out.println("Employee ID:"+ empID);
		
		System.out.println("Employee Name");
		String empName = s.next();
		System.out.println("Employee Name:"+ empName);
		
		System.out.println("Employee Email");
		String emailId = s.next();
		System.out.println("Employee Email:"+ emailId);
		
		System.out.println("Employee PhoneNum");
		long phoneNum = s.nextLong();
		System.out.println("Employee PhoneNum:"+phoneNum);
		
		System.out.println("Employee Salary");
		double empSalary = s.nextDouble();
		System.out.println("Employee Salary:"+empSalary);
		
		System.out.println("Employee Gender");
		char gender = s.next().charAt(0);
		System.out.println("Employee Gender:"+ gender);
		
		System.out.println("Employee City");
		String city = s.next();
		System.out.println("Employee City:"+ city);
		
		
	}

}
