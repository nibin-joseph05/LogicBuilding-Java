/*
    DAY - 05
Calculate the Sum of Digits of a Given Number:

Write a program that calculates the sum of the digits of a number entered by the user. For example:

Input: Enter a number: 1234
Output: Sum of digits: 10
Write a Program to Check Whether a Character is a Vowel or Consonant:

Write a program to check whether a character entered by the user is a vowel (a, e, i, o, u) or a consonant. For example:

Input: Enter a character: e
Output: e is a vowel.
Write a Program to Find the ASCII Value of a Character:

Write a program that takes a character as input and displays its ASCII value. For example:

Input: Enter a character: A
Output: ASCII value of A: 65
*/

package days.day05;

import java.util.Scanner;

public class Day05Programs {

    public void sumOfDigitsOfANumber(int num){
        double sum = 0;

        while(num != 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        System.out.println("The sum is : " + sum);
    }


    public void run(Scanner scanner){

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        sumOfDigitsOfANumber(num);
    }
}
