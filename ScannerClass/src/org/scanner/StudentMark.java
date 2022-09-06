package org.scanner;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Student ID");
		byte studentID = s.nextByte();
		System.out.println("Student ID:"+studentID);
		
		System.out.println("Student Name");
		String studentName = s.next();
		System.out.println("Student Name:"+ studentName);
		
		System.out.println("Mark 1");
		byte mark1 = s.nextByte();
		System.out.println("Mark 1:"+ mark1);
		
		System.out.println("Mark 2");
		byte mark2 = s.nextByte();
		System.out.println("Mark 2:"+ mark2);

		System.out.println("Mark 3");
		byte mark3 = s.nextByte();
		System.out.println("Mark 3:"+ mark3);

		System.out.println("Mark 4");
		byte mark4 = s.nextByte();
		System.out.println("Mark 4:"+ mark4);

		System.out.println("Mark 5");
		byte mark5 = s.nextByte();
		System.out.println("Mark 5:"+ mark5);

	}

}
