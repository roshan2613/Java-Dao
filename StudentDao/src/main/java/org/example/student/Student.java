package org.example.student;

import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    int rollNumber;
    String[] arrSubjects;

    public String[] getArrSubjects() {
        return arrSubjects;
    }

    public void setArrSubjects(String[] arrSubjects) {
        this.arrSubjects = arrSubjects;
    }

    public Student(String firstName, String lastName, int rollNumber, String[] arrSubjects ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.arrSubjects = arrSubjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber=" + rollNumber +
                ", arrSubjects=" + Arrays.toString(arrSubjects) +
                '}';
    }
}
