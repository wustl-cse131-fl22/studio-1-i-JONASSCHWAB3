package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean leapYear = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a year (date format: XXXX).");
		int year = in.nextInt();
		
		double moduloTest1 = 0;
		moduloTest1 = year % 4;
		//System.out.println(moduloTest1);
		
		double moduloTest2 = 0;
		moduloTest2 = year % 100;
		//System.out.println(moduloTest2);
		
		double moduloTest3 = 0;
		moduloTest3 = year % 400;
		//System.out.println(moduloTest3);
		
		leapYear = ((moduloTest1 == 0) && (moduloTest2 != 0));
		Boolean leapYearTest = leapYear;
		leapYearTest = ((leapYear == false) && (moduloTest3 == 0));
//		if (moduloTest1 == 0) {
//			if (moduloTest2 != 0) {
//				leapYear = true;
//			} else {
//				if (moduloTest3 == 0) {
//					leapYear = true;
//				}
//			}
// 		}
		//System.out.println(leapYear);
		//System.out.println(leapYearTest);
		
		Boolean leapYearFinal = (leapYear || leapYearTest);
		System.out.println(leapYearFinal);
		
		
		
		
	}

}
