package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average = 0;
		System.out.println("Please enter two numbers to be averaged.");
		Scanner in = new Scanner(System.in);
		System.out.println("Value for number 1?");
		int n1 = in.nextInt();
		System.out.println("Value for number 2?");
		int n2 = in.nextInt();
		
		average = (n1 + n2)/2.0;
		System.out.println("Average of the Two Numbers: " + average);
	}

}
