package org.example;

import org.example.student.Student;

public class Main {
    public static void main(String[] args) {
        String subjectList [] = {"Math", "C.s", "Eng"};
        Student studnet = new Student("Roshan","R.K", 27,subjectList);
        System.out.println(studnet);


    }
}