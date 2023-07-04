package com.modulefive.classtwelve;

/*
Armar un programa para organizar un "amigo invisible": Este programa debe permitir a los participantes ingresar sus nombres.
Luego, cada participante debe sentarse frente a la computadora, escribir su nombre y recibir una indicación sobre a quién debe darle un regalo.
El programa también debe limpiar la consola después de que cada participante haya visto su indicación.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InvisibleFriend {
    private static Scanner console = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("*** Welcome to the game Invisible Friend ***");

        int quantity = getNumberofPersons();
        String[] persons = getPersonNames(quantity);

        // Generate random assigns
        List<String> availablePersons = new ArrayList<>(List.of(persons));

        for (String person : persons) {
            clearScreen();
            waitForEnter("It's " + person + "'s turn. Please sit in front of the screen and press Enter to continue...");

            clearScreen();
            String assignedPerson = getRandomPerson(availablePersons, person);
            System.out.println(person + " will give a gift to " + assignedPerson);
            availablePersons.remove(assignedPerson);

            waitForEnter("Press Enter to continue...");
        }
    }

    private static int getNumberofPersons() {
        System.out.println("Please, how many persons are?");
        return console.nextInt();
    }

    private static String[] getPersonNames(int quantity) {
        console.nextLine(); // Consume the char of the new line

        String[] persons = new String[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Add the name of the person " + (i + 1));
            persons[i] = console.nextLine();
        }

        return persons;
    }

    private static void clearScreen() {
        for (int i = 0; i < 50; i ++) {
            System.out.println();
        }
    }

    private static void waitForEnter(String message) {
        System.out.println(message);
        console.nextLine();
    }

    private static String getRandomPerson(List<String> availablePersons, String currentPerson) {
        String randomPerson = null;

        do {
            randomPerson = availablePersons.get(random.nextInt(availablePersons.size()));
        } while (randomPerson.equals(currentPerson));

        return randomPerson;
    }
}
