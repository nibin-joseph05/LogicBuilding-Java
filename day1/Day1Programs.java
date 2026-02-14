/* 
DAY - 01
Program to Print Integer Numbers Entered by the User:

Write a program where the user is asked to enter an integer number, and the program prints that number back to them. For example:

Input: 42
Output: You entered: 42

Write a Program to Find the Size of int, float, double, and char on Your Computer:

Write a program that displays the size of fundamental data types (int, float, double, and char) on your system. For example:

Output:
Size of int: 4 bytes
Size of float: 4 bytes
Size of double: 8 bytes
Size of char: 1 byte
Program to Find the Larger Number Among Two Numbers:

Write a program to compare two integers entered by the user and print the larger one. For example:

Input: Enter two numbers: 15, 20
Output: The larger number is: 20
*/

import java.util.Scanner;

public class Day1Programs {
	
	public static int takeSwitchInputChoice(Scanner scanner) {
		System.out.println("Enter the Operation you want to perform : \n  1. Print Entered Number : \n  2. Show Data Type Sizes : \n  3. Find the Larger Number \n  0. Exit ");
		int choice = scanner.nextInt();
		return choice;
	}
	
	public static void printEnteredNumber(Scanner scanner) {
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		
		System.out.println("The number you entered is : " + num);  
	}
	
	public static void showDataTypesSizes() {
		System.out.println("The size of int is : " + Integer.BYTES + " bytes.");
		System.out.println("The size of double is : " + Double.BYTES + " bytes.");
		System.out.println("The size of float is : " + Float.BYTES + " bytes.");
		System.out.println("The size of char is : " + Character.BYTES + " bytes.");
	}
	
	public static void largerNumber(Scanner scanner) {
		System.out.println("Enter the first Number : ");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second Number : ");
		double num2 = scanner.nextDouble();
		
		if (num1 > num2) {
			System.out.println("Number " + num1 + " is larger ");
		}
		else if(num2 > num1) {
			System.out.println("Number " + num2 + " is larger ");
		}
		
		else {
			System.out.println("they are equal!");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			int choice = takeSwitchInputChoice(scanner);
			
			boolean running = true;
			
			while(running) {
				switch(choice) {
				case 1 -> {
					printEnteredNumber(scanner);
					choice = takeSwitchInputChoice(scanner);
				}
				case 2 -> {
					showDataTypesSizes();
					choice = takeSwitchInputChoice(scanner);
				}
				case 3 -> {
					largerNumber(scanner);
					choice = takeSwitchInputChoice(scanner);
				}
				case 0 -> {
					System.out.println("Exiting........");
					running = false;
				}
				default -> {
					System.out.println("Invalid choice. Choose Again : ");
					choice = takeSwitchInputChoice(scanner);
				}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
	}

}
