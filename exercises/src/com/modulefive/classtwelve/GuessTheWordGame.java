package com.modulefive.classtwelve;

import java.util.Scanner;

public class GuessTheWordGame {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] secretWords = {"elephant", "guitar", "strawberry", "computer"};

        String[] clues = {
                "It is a very large animal, with a trunk. What is it?",
                "It is a stringed musical instrument. What is it?",
                "It's a small, red fruit, very tasty. What is it?",
                "It is an electronic device that is used to perform tasks and access the internet. What is it?",
        };

        int randomIndex = (int) (Math.random() * secretWords.length);
        String secretWord = secretWords[randomIndex];
        String clue = clues[randomIndex];

        System.out.println(clue);
        String guess = console.nextLine();

        if (guess.equalsIgnoreCase(secretWord)) {
            System.out.println("That's right! You have guessed the word.");
        } else {
            System.out.println("Incorrect. The correct word was: " + secretWord);
        }
        console.close();

    }

}
