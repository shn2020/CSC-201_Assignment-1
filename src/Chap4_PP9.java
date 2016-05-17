/**
 * CSC 201, Summer 2016
 * @author Sang Nguyen
 * Chapter 4, Programming Project 9
 */

import java.util.Scanner;

public class Chap4_PP9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N, coupon = 0, chocolate = 0;
		
		// Prompt user to enter the amount of money
		System.out.print("Enter the amount of money: ");
		N = input.nextInt();
		
		// User while loop 
		while (N > 0) {
			N--;
			chocolate++;
			coupon++;
			if (coupon == 6) {
				coupon = 1;
				chocolate++;
			}
		}
		
		// Print the results
		System.out.println("Chocolate bars consumed: " + chocolate);
		System.out.println("Coupon left: " + coupon);
	}
}
