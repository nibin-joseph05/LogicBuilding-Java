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


package days.day01;

import java.util.Scanner;

public class Day01Programs {
    public void printNumberEnteredByUser(Scanner scanner){
        System.out.println("Enter a number : " );
        int num = scanner.nextInt();
        System.out.println("The number you entered is : " + num);
    }
    public void showDataTypeSize(){
        System.out.println("The size of Int is : " + Integer.BYTES);
        System.out.println("The size of float is : " + Float.BYTES);
        System.out.println("The size of double is : " + Double.BYTES);
        System.out.println("The size of char is : " + Character.BYTES);
    }
    public void largerAmongTwoNumbers(Scanner scanner){
        System.out.println("Enter the first number : " );
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number : " );
        double num2 = scanner.nextDouble();

        if (num1 != 0 || num2 != 0){
            if(num1 > num2){
                System.out.println("the number " + num1 + " is greater!");
            }
            else if (num2 > num1){
                System.out.println("the number " + num2 + " is greater!");
            }
            else if(num1 == num2){
                System.out.println("They are Equal!");
            }
        }
        else{
            System.out.println("Both Value cant be Zero!");
        }
    }

    public void run(Scanner scanner){
        printNumberEnteredByUser(scanner);
        showDataTypeSize();
        largerAmongTwoNumbers(scanner);
    }

}