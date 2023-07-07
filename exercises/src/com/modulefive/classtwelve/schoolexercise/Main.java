package com.modulefive.classtwelve.schoolexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("Enter the amount of students: ");
        int studentsAmount = console.nextInt();
        console.nextLine();

        for (int i = 0; i < studentsAmount; i++) {
            System.out.println("Student #" + (i + 1));
            System.out.println("First name: ");
            String firstName = console.nextLine();
            System.out.println("Last name: ");
            String lastName = console.nextLine();

            Student student = new Student(firstName, lastName);
            students.add(student);

            System.out.println("Enter the amount of notes: ");
            int notesAmount = console.nextInt();
            console.nextLine();

            for (int j = 0; j < notesAmount; j++) {
                System.out.println("Enter the note #" + (j + 1) + ": ");
                double note = console.nextDouble();
                student.addNote(note);
            }
        }

        System.out.println("----- Results -----");
        for (Student student : students) {
            System.out.println("Student " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Notes: " + student.calculateProm());
            System.out.println("----------");
        }
    }
}
