import java.util.Scanner;

import service.StudentService;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        StudentService service = new StudentService();
        service.run(scanner);
    }
}