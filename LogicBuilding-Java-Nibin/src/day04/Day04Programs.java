/*
DAY - 04
Print the Multiplication Table of a Given Number:

Write a program where the user enters a number, and the program prints its multiplication table. For example:

Input: Enter a number: 5
Output:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
Write a Program to Make a Simple Calculator Using a Switch Case:

Write a program that acts as a calculator, taking two numbers and an operator (+, -, *, /) from the user, and performing the operation based on the operator. For example:

Input: Enter first number: 10, Operator: +, Second number: 20
Output: 10 + 20 = 30
Print a Number in Reverse Order:

Write a program where the user enters a number, and the program prints it in reverse order. For example:

Input: 1234
Output: 4321

Problem:

Check whether a number is a palindrome.

 A number is palindrome if it reads the same forward and backward.

Example:
Input: 121
Output: Palindrome

Input: 123
Output: Not Palindrome

Problem:

Find the sum of digits of a number.

Example:
Input: 1234
Output: 10

Because:

1 + 2 + 3 + 4 = 10

Problem 3 — Count Digits
Example:
Input: 12345
Output: 5

*/

package day04;

import java.util.Scanner;

public class Day04Programs {
    public void multiplicationTable(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + num*i );
        }
    }

    public void simpleCalculator(double num1, double num2, char choice){
        switch(choice){
            case '+' -> System.out.println("the result is : " + (num1 + num2));
            case '-' -> System.out.println("the result is : " + (num2 - num1));
            case '*' -> System.out.println("the result is : " + (num2 * num1));
            case '/' -> System.out.println("the result is : " + (num2 / num1));

            default -> System.out.println("invalid input!");
        }
    }

    public int reverseOfANumber(int num) {

        int reversed = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }

        return reversed;
    }

    public boolean palindromeOrNot(int num){

        int number = num;
        int reversed = 0;

        while(num != 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }

        return number == reversed;
    }

    public void sumOfDigitsOfANumber(int num){
        double sum = 0;

        while(num != 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        System.out.println("The sum is : " + sum);
    }

    public void countDigits(int num){
        int count = 0;

        while(num != 0){
            int lastDigit = num % 10;
            num /= 10;
            count++;
        }

        System.out.println("The count is : " + count);
    }

    public void run(Scanner scanner){

//        System.out.println("Enter a number : ");
//        int num = scanner.nextInt();
//
//        multiplicationTable(num);

//        System.out.println("Enter a number : ");
//        double num1 = scanner.nextInt();
//
//        System.out.println("Enter the operation you want to perform : \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
//        int choice = scanner.nextInt();
//
//        System.out.println("Enter the operation you want to perform : +, -, *, / ");
//        char choice = scanner.next().charAt(0);
//
//        System.out.println("Enter another number : ");
//        double num2 = scanner.nextInt();
//
//        simpleCalculator(num1, num2, choice);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
//
//        System.out.println(reverseOfANumber(num));
//
//        System.out.println(palindromeOrNot(num) ? "the number is palindrome!" : "the number is not palindrome!" );
//
//        sumOfDigitsOfANumber(num);

        countDigits(num);

    }
}
