/*
DAY - 03
Program to Calculate the Square and Cube of a Number:

Write a program where the user enters a number, and the program calculates its square and cube. For example:

Input: Enter a number: 3
Output: Square: 9, Cube: 27
Program to Calculate the Area of a Circle and Triangle:

Write a program to calculate the area of a circle given its radius and a triangle given its base and height. For example:

Input: Radius: 5, Base: 10, Height: 4
Output:
Area of Circle: 78.5
Area of Triangle: 20
Write a Program to Find the Quotient and Remainder of Two Integers:

Write a program where the user enters two integers (divisor and dividend) and calculates their quotient and remainder. For example:

Input: Dividend: 22, Divisor: 7
Output:
Quotient: 3
Remainder: 1
*/

package days.day03;
import java.util.Scanner;

public class Day03Programs {
    public String squareAndCubeOfANumber(double num){
        double square = num * num ;
        double cube = num * num * num;
        return "square : " + square + " cube : " + cube  ;
    }

    public String areaOfCircleAndTriangle(double radius, double base, double height) {
        double circleArea = Math.PI * radius * radius;
        double triangleArea = base * height / 2;
        return "\nArea of Circle: " + circleArea  +
               "\nArea of Triangle: " + triangleArea ;
    }

    public String quotientAndRemainderOfTwoIntegers(double dividend, double divisor){
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        return "Quotient : " + quotient + "Remainder : " + remainder;
    }

    public void run(Scanner scanner){

        System.out.println("Enter a Number : ");
        double num = scanner.nextDouble();
        System.out.println(squareAndCubeOfANumber(num));

        System.out.println("Enter the radius : ");
        double radius = scanner.nextDouble();

        System.out.println("Enter the base : ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();

        System.out.println(areaOfCircleAndTriangle(radius, base, height));

        System.out.println("Enter the Dividend : ");
        double dividend = scanner.nextDouble();

        System.out.println("Enter the Divisor : ");
        double divisor = scanner.nextDouble();

        System.out.println(quotientAndRemainderOfTwoIntegers(dividend, divisor));

    }
}
