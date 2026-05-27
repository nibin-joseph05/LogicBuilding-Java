import java.util.Scanner;

import basics.BasicProblems;
import strings.StringProblems;

public class FundamentalsMain{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        BasicProblems bp = new BasicProblems();

//        bp.run(scanner);

        StringProblems sp = new StringProblems();
        sp.printEachCharacter("nibin");
        sp.countLength("nibin");
        sp.vowelCounter("education");
        sp.reverseString("sample");
        sp.reverseNumber(4321);
        sp.palindromeOrNot("nibin");
        sp.palindromeOrNot("abcd");

        sp.reverseEachWord("hello java world");

    }
}