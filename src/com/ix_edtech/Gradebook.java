package com.ix_edtech;

import java.util.ArrayList;

public class Gradebook {
    private ArrayList<Student> students;

    public Gradebook() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    public void addGrade(String studentName, double grade) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                student.addGrade(grade);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public Student getTopStudent() {
        if (students.isEmpty()) {
            return null;
        }
        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.calculateAverageGrade() > topStudent.calculateAverageGrade()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public void generatePerformanceReport() {
        if (students.isEmpty()) {
            System.out.println("No students in the gradebook.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

