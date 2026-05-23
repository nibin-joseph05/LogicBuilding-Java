import service.StudentService;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        StudentService.run(scanner);
    }
}