package helper;

import days.day01.Day01Programs;
import days.day02.Day02Programs;
import days.day03.Day03Programs;
import days.day04.Day04Programs;

import java.util.Scanner;

public class MainHelper {

    public static void run(Scanner scanner){

        // days.day01
        Day01Programs day01 = new Day01Programs();
        day01.run(scanner);

        // days.day02
        Day02Programs day02 = new Day02Programs();
        day02.run(scanner);

        // days.day03
        Day03Programs day03 = new Day03Programs();
        day03.run(scanner);

        // days.day04
        Day04Programs day04 = new Day04Programs();
        day04.run(scanner);
    }

}
