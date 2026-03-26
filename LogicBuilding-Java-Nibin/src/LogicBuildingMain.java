//main class

import helper.MainHelper;
import java.util.Scanner;

public class LogicBuildingMain{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MainHelper.run(scanner);

        scanner.close();
    }
}