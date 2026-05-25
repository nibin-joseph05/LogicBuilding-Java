package basics;

import java.util.Scanner;

public class BasicProblems {
    public void run(Scanner scanner){

        try{
            System.out.println("Enter a number : ");
            int num1 = scanner.nextInt();

//            System.out.println("Enter another number : ");
//            int num2 = scanner.nextInt();
//
//            System.out.println("Enter third number : ");
//            int num3 = scanner.nextInt();

//            oddOrEvenChecker(num);

//            largestOfThreeNumbers(num1, num2, num3);

//            multiplicationTable(num1);
//            reverseOfANumber(num1);
//            sumOfDigits(num1);
            palindromeOrNot(num1);

        }
        catch(Exception e){
            System.out.println("Error! " + e.getMessage());
        }

    }

    public void oddOrEvenChecker(int num){

        if(num %2== 0){
            System.out.println("The number is Even!");
        }
        else{
            System.out.println("The number is Odd!");
        }
    }

    public void largestOfThreeNumbers(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 is greater!");
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("Number 2 is greater!");
        }
        else{
            System.out.println("Number 3 is greater!");
        }
    }

    public void multiplicationTable(int num){
        for(int i = 1;i <= 10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }

    public void reverseOfANumber(int num){
        int reversed = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }
        System.out.println("Reversed number is : " + reversed);
    }

    public void sumOfDigits(int num){
        int reversed = 0;
        int sum = 0;
        while(num != 0){
            reversed = num % 10;
            sum += reversed;
            num /= 10;
        }
        System.out.println("Sum of digit is : " + sum);
    }

    public void palindromeOrNot(int num){
        int reversed = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }

        if (num == reversed){
            System.out.println("The number is palindrome!");
        }
        else{
            System.out.println("The number is not palindrome!");
        }
    }
}
