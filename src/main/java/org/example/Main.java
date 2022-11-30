package org.example;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jhon",50);
        Student student2 = new Student("Carlos",80);
        Student student3 = new Student("Joaquin",70);
        Student student4 = new Student("Lucía",60);

        Map<String,Student> students = new HashMap<>();

        students.put(student1.getName(),student1);
        students.put(student2.getName(),student2);
        students.put(student3.getName(),student3);
        students.put(student4.getName(),student4);

        for (Student s:students.values()) {
            System.out.println(s);
        }

        Student.increaseGrade(students);

        System.out.println("=====================");

        for (Student s:students.values()) {
            System.out.println(s);
        }
    }
}