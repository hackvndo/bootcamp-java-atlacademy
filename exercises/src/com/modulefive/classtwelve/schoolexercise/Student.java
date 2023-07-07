package com.modulefive.classtwelve.schoolexercise;

/*
Crear un programa para ingresar las notas de alumnos utilizando programación orientada a objetos:
El programa debe permitir al usuario cargar las notas de varios alumnos. Cada alumno debe tener atributos como nombre,
apellido y una lista de notas. Utilizando la programación orientada a objetos, el programa debe permitir ingresar las
notas de cada alumno y realizar cálculos como el promedio de notas.
 */

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private List<Double> notes;

    public Student() {}

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.notes = new ArrayList<>();
    }

    public void addNote(double note) {
        notes.add(note);
    }

    public double calculateProm() {
        if (notes.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public List<Double> getNotes() {
        return notes;
    }

    public void setNotes(List<Double> notes) {
        this.notes = notes;
    }
}
