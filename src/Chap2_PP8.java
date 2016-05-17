/**
 * CSC 201, Summer 2016
 * @author Sang Nguyen
 * Chapter 2, Programming Project 8
 */

import java.util.Scanner;

public class Chap2_PP8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age, mChocolate, wChocolate;
		double weight, height, mBMR, wBMR;
		
		// Prompt the user to enter his/her weight, height and age
		System.out.print("Enter your weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter your height in inches: ");
		height = input.nextDouble();
		System.out.print("Enter you age in years: ");
		age = input.nextInt();
		
		// Calculate BMR and chocolate bars need
		mBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		wBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		mChocolate = (int)mBMR/230;
		wChocolate = (int)wBMR/230;
		
		// Print the results
		System.out.println();
		System.out.println("Number of chocolate bars for a man: " + mChocolate );
		System.out.println("Number of chocolate bars for a woman: " + wChocolate);
	}
}
