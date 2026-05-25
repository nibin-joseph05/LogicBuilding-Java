package model;

public class Student {
    private int studentId;
    private String name;
    private double[] marks = new double[3];

    public Student(int studentId, String name, double[] marks){
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }


}
