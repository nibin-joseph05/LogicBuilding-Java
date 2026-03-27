/*
    DAY - 06
Pattern 1: Sqaure
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
Pattern 2: Right-angled trinagle
*
* *
* * *
* * * *
* * * * *
Pattern 3: Hallow Rectangle
* * * * *
*       *
*       *
*       *
* * * * *

*/

package days.day06;

import java.util.Scanner;

public class Day06Programs {
    public void printSquarePattern(int rows, int columns){
        for (int i = 1; i <= rows; i++){
            for(int j =1;j <= rows ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printRightAngledTriangle(int rows, int columns){
        for(int i = 0; i <= rows; i++){
            for(int j =0; j <= columns; j++){
                System.out.print("* ");
            }
        }
    }

    public void run(Scanner scanner){

        System.out.println("Enter the rows : ");
        int rows = scanner.nextInt();

        System.out.println("Enter the columns : ");
        int columns = scanner.nextInt();

        printSquarePattern(rows, columns);
    }
}
