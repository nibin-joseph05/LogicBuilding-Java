package strings;

import java.sql.SQLOutput;

public class StringProblems {

    public void printEachCharacter(String text){
        for(int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }

    public void countLength(String text){
        System.out.println("The count is " + text.length());
    }

    public void vowelCounter(String text){
        int vowelCounter = 0;
        for(int i = 0; i < text.length(); i++){
            switch(text.charAt(i)){
                case 'a', 'e', 'i', 'o','u' -> ++vowelCounter;
            }

        }

        System.out.println("The vowel count is " + vowelCounter);
    }

    public void reverseString(String text){
        String reversed = "";
        for(int i = text.length()-1;i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println(reversed);
    }

    public void reverseNumber(int number){

        int reversed = 0;

        while(number != 0){
          int lastDigit = number % 10;
          reversed = reversed * 10 + lastDigit;
          number /= 10;
        }
        System.out.println("Reverse of the number is " + reversed);
    }

    public void palindromeOrNot(String text){
        String reversed = "";
        for(int i = text.length() -1 ; i >= 0; i--){
            reversed += text.charAt(i);
        }

        if(reversed.equals(text)){
            System.out.println(text + " is palindrome");
        }
        else{
            System.out.println(text + " is not palindrome");
        }
    }

    public void checkStringLength(String text1, String text2){
        if(text1.length() == text2.length()){
            System.out.println("They are equal length!");
        }
        else{
            System.out.println("They are not equal length!");
        }

    }

    public void reverseString2(String text){
        String reversed = "";

        for(int i = text.length() -1; i >= 0; i--){
            reversed += text.charAt(i);
        }

        System.out.println("The reversed is " + reversed);
    }

    public void fibanacci(int limit){
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum = firstNum  + secondNum;

        System.out.print("The sequence is " + firstNum + " ," + secondNum + ", " + thirdNum);

        for(int i = 1 ; i <= limit; i++){
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = firstNum  + secondNum;

            System.out.print(", " + thirdNum);
        }
    }

    public void longestPalindromicSubstring(String text){

        for(int i = 0; i <= text.length() -1; i++){
            for(int j = i + 1; j <= text.length();j++){

            }
        }
    }


}
