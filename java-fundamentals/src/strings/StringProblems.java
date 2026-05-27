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

    public void reverseEachWord(String text){
        String[] wordArray = text.split(" ");
        System.out.println(wordArray);
    }

}
