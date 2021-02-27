package com.kriti;


import java.util.Date;

public class World
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student student  = new Student(123, "Kri", "Xi", new Date(), Gender.FEMALE, "123 XYX Street",
                "Chings", "1234321", "9889123412", "kk127n@xyz.com", "TIN",
                new float[]{80,90,70,80,91,92,82});
        student.calculateTotalMarks();
        student.calculatePercentage();
        student.calculateGrade();
        System.out.println(student.getGrade());
        System.out.println(student.getTotalMarks());

    }
}


