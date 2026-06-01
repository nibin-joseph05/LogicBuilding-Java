import java.util.Scanner;

import basics.BasicProblems;
import revise.Revise;
import strings.StringProblems;

public class FundamentalsMain{
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);

//        BasicProblems bp = new BasicProblems();

//        bp.run(scanner);

//        StringProblems sp = new StringProblems();
//        sp.printEachCharacter("nibin");
//        sp.countLength("nibin");
//        sp.vowelCounter("education");
//        sp.reverseString("sample");
//        sp.reverseNumber(4321);
//        sp.palindromeOrNot("nibin");
//        sp.palindromeOrNot("abcd");
//
//        sp.checkStringLength("hello", "hello");
////        sp.arrangeInOrder("hai");
//        sp.reverseString2("nibin2");
//        sp.fibanacci(15);

        Revise revise = new Revise();
        revise.reverseString("abcd");
        revise.palindromeOrNot("nibin");
        revise.reverseNumber(1234);
        revise.findFibonacci(5);
        revise.countVowels("education");
        int[] sampleArray = {1, 2, 3, 4, 5};
        revise.largestInArray(sampleArray);
    }
}