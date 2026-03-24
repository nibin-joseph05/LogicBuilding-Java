//main class

import java.util.Scanner;

import day01.Day01Programs;

public class LogicBuildingMain{
    public static void main(String[] args){
        //input
        Scanner scanner = new Scanner(System.in);
        //day01
        Day01Programs day01 = new Day01Programs();
        day01.run(scanner);


        scanner.close();
    }
}