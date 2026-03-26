package helper;

import days.day01.Day01Programs;
import days.day02.Day02Programs;
import days.day03.Day03Programs;
import days.day04.Day04Programs;
import days.day05.Day05Programs;

import java.util.Scanner;

public class MainHelper {

    public static void run(Scanner scanner){

        // day01
        Day01Programs day01 = new Day01Programs();
        day01.run(scanner);

        // day02
        Day02Programs day02 = new Day02Programs();
        day02.run(scanner);

        // day03
        Day03Programs day03 = new Day03Programs();
        day03.run(scanner);

        // day04
        Day04Programs day04 = new Day04Programs();
        day04.run(scanner);

        // day05
        Day05Programs day05 = new Day05Programs();
        day05.run(scanner);

    }

}
