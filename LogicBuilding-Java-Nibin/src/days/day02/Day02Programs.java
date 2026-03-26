/*
    DAY - 02
Program to Check Whether the Number is Odd or Even:

Write a program that checks whether a number entered by the user is odd or even. For example:

Input: Enter a number: 7
Output: 7 is an odd number
Program to Check Whether the Number is Divisible by 5:

Write a program that determines if a number entered by the user is divisible by 5. For example:

Input: Enter a number: 25
Output: 25 is divisible by 5.
Program to Check Whether the Number is a Multiple of 7:

Write a program that verifies if a number entered by the user is a multiple of 7. For example:

Input: Enter a number: 14
Output: 14 is a multiple of 7.
NOTES
Taking Input from the user in NodeJs Environment
Node.js provides several methods for receiving input from users, including reading from standard input (stdin), command-line arguments, and user prompts.

Using readline-sync
This module is used to receive input from the user synchronously, ensuring program execution line by line.
command : npm install readline-sync

    Importing the module
    const readline = require("readline-sync");

    Enter the number
    let a = Number(readline.question());
    let number = [];
    for (let i = 0; i < a; ++i) {
      number.push(Number(readline.question()));
    }
    console.log(number);

Output
2 1 2 [1,2]


 */

package days.day02;

import java.util.Scanner;

public class Day02Programs {
    public void oddOrEvenChecker(Scanner scanner){
        System.out.println("enter a number : ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println( number + " is an even number");
        }
        else{
            System.out.println( number + " is an odd number");
        }
    }

    public void divisibleByFiveOrNot(Scanner scanner){
        System.out.println("enter a number : ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5!");
        }
        else{
            System.out.println(number + " is not divisible by 5!");
        }
    }

    public void multipleOfSevenOrNot(Scanner scanner){
        System.out.println("enter a number : ");
        int number = scanner.nextInt();
        if (number % 7 == 0) {
            System.out.println(number + " is multiple of 7!");
        }
        else{
            System.out.println(number + " is not multiple of 7!");
        }

    }

    public void run(Scanner scanner){
        oddOrEvenChecker(scanner);
        divisibleByFiveOrNot(scanner);
        multipleOfSevenOrNot(scanner);
    }
}
