package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isOrdered = false;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		isOrdered = ((x < y) && (y < z)) || ((x > y) && (y > z));
		
//		if (x < y) {
//			if (y < z) {
//				isOrdered = true;
//			}
//		} 
//		if  (x > y) {
//			if (y > z) {
//				isOrdered = true;
//			}
//		}
		System.out.println(isOrdered);

	}

}
