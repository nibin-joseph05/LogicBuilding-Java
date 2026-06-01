package revise;

public class Revise {

    public void reverseString(String text){
        String reversed = "";
        for(int i = text.length() -1;i >= 0; i--){
            reversed += text.charAt(i);
        }

        System.out.println ("The reversed text is " + reversed);
    }

    public void palindromeOrNot(String text){
        String reversed = "";
        for(int i = text.length() -1; i >= 0; i--){
            reversed += text.charAt(i);
        }

        if (text.equals(reversed)){
            System.out.println ("The text is palindrome!");
        }
        else{
            System.out.println ("The text is not palindrome!");
        }
    }

    public void reverseNumber(int num){
        int reversed = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }

        System.out.println("The reversed number is " + reversed);
    }

    public void findFibonacci(int limit){
        int number1 = 0;
        int number2 = 1;
        int number3 = number1 + number2;

        System.out.print(number1 + ", " + number2 + ", " + number3);

        for(int i = 1; i <= limit; i++){
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;

            System.out.print(", " +  number3);
        }
    }

    public void countVowels(String text){
        int vowelsCount = 0;
        for(int i = 0; i < text.length(); i++){
            switch(text.charAt(i)){
               case 'a', 'e', 'i', 'o', 'u' -> vowelsCount++;
            }
        }
        System.out.println(); // extra space from previous method
        System.out.println("The vowel count is " + vowelsCount);
    }

    public void largestInArray(int[] numbers){
        int largest = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is " + largest);
    }



}
