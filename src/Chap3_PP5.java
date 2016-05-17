/**
 * CSC 201, Summer 2016
 * @author Sang Nguyen
 * Chapter 3, Programming Project 5
 */

import java.util.Scanner;

public class Chap3_PP5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age, mChocolate, wChocolate;
		double weight, height, mBMR, wBMR;
		String gender;
		
		// Prompt the user to enter his/her weight, height and age
		System.out.print("Enter your weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter your height in inches: ");
		height = input.nextDouble();
		System.out.print("Enter you age in years: ");
		age = input.nextInt();
		System.out.print("Enter your gender as M stands for Man and W stands for woman: ");
		gender = input.next();
		System.out.println();
		
		// Use switch case 
		switch (gender) {
		case "M":
			mBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
			mChocolate = (int)mBMR/230;
			System.out.println("Number of chocolate bars to consume: " + mChocolate );
			break;
			
		case "W": 
			wBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
			wChocolate = (int)wBMR/230;
			System.out.println("Number of chocolate bars to consume: " + wChocolate);
			break;
		}
	}
}
