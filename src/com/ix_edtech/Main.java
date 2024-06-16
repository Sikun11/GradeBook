package com.ix_edtech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Gradebook Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Generate Performance Report");
            System.out.println("4. Get Top Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    gradebook.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    gradebook.addGrade(studentName, grade);
                    break;
                case 3:
                    gradebook.generatePerformanceReport();
                    break;
                case 4:
                    Student topStudent = gradebook.getTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top Student: " + topStudent);
                    } else {
                        System.out.println("No students in the gradebook.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

