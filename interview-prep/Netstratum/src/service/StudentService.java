package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    List<Student> students = new ArrayList<>();

    public static void addStudent(){

    }

    public static void run(Scanner scanner){
        System.out.println("-----Welcome-----");

        System.out.println("Enter the operation you want to perform : \n 1. Add Student \n 2. View All Student \n 3. Find Topper \n 4. Search Student By Id \n 5. Calculate Average Marks \n 6. Exit");

        int choice = scanner.nextInt();

//        if(choice < 1 || choice > 6 ){
//            System.out.println(("Invalid choice!"));
//        }
//        else{
            while (true) {
                switch(choice){
                    case 1 -> addStudent();

                    default -> System.out.println(("Invalid choice!"));
                }
            }
//        }
    }


}
