package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;

public class StudentService {

    List<Student> students = new ArrayList<>();

    public void addStudent(Scanner scanner){
        System.out.println("Enter the student id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the student name : ");
        String name = scanner.nextLine();

        double[] marks = new double[3];

        for (int i=0;i <3; i++){
            System.out.println("Enter student marks : ");
            marks[i] = scanner.nextDouble();
        }

        students.add(new Student(id, name, marks));

    }

    public void viewStudent(){
        for(Student student : students){
            System.out.println("The students details are : " + student);
        }
    }



    public void run(Scanner scanner){
        System.out.println("-----Welcome-----");

        System.out.println("Enter the operation you want to perform : \n 1. Add Student \n 2. View All Student \n 3. Find Topper \n 4. Search Student By Id \n 5. Calculate Average Marks \n 6. Exit");

        int choice = scanner.nextInt();

            while (true) {
                switch(choice){
                    case 1 ->{
                        addStudent(scanner);

                    }
                    case 2 -> viewStudent();

                    case 6 -> {
                        System.out.println("Exiting....");
                        break;
                    }

                    default -> System.out.println(("Invalid choice!"));
                }
            }
    }


}
