//main class

import java.util.Scanner;

import day01.Day01Programs;
import day02.Day02Programs;

public class LogicBuildingMain{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //day01
//        Day01Programs day01 = new Day01Programs();
//        day01.run(scanner);

        //day02
        Day02Programs day02 = new Day02Programs();
        day02.run(scanner);


        scanner.close();
    }
}