//main class

//import helper.MainHelper;
import java.util.Scanner;

public class LogicBuildingMain{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        MainHelper.run(scanner);

//        System.out.println("Enter a number : ");
//        int number = scanner.nextInt();
//
//        int reversed = 0;
//
//        while(number!=0){
//            int lastDigit = number % 10;
//            reversed = reversed * 10 + lastDigit;
//            number /= 10;
//        }
//
//        System.out.println(reversed);


//        System.out.println("Enter a string : ");
//        String string = scanner.nextLine();
//
//        String reversed = "";
//
//        for(int i = string.length() - 1; i >= 0; i--){
//            reversed += string.charAt(i);
//
//        }
//
//        if(string.equals(reversed)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }

//        int arr[] = {1,3,4,5,6,7};
//
//        int largest = arr[0];
//
//        for(int i = 0; i < arr.length ;i++){
//            if(arr[i] > largest){
//                largest = arr[i];
//            }
//
//        }
//
//        System.out.println(largest);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime && number > 1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }


        scanner.close();
    }
}