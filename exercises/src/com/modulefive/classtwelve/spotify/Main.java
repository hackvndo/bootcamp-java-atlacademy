package com.modulefive.classtwelve.spotify;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PlayList playList = new PlayList();
        Scanner console = new Scanner(System.in);

        int option;
        do {
            System.out.println("""
                ***** Play List *****
                1. Add Song
                2. Play Song
                3. Exit
                Choose an option
                """);
            option = console.nextInt();
            console.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the title of the song");
                    String title = console.nextLine();
                    System.out.println("Enter the artist of the song");
                    String artist = console.nextLine();
                    System.out.println("Enter the time of the song in seconds");
                    int duration = console.nextInt();
                    console.nextLine();

                    Song song = new Song(title, artist, duration);
                    playList.addSong(song);
                    System.out.println("The song has added to the playlist");
                    System.out.println();
                    break;
                case 2:
                    playList.playSong();
                    break;
                case 3:
                    System.out.println("Leaving the program");
                    break;
                default:
                    System.out.println("Invalid option. Try again");
            }
        } while (option != 3);
    }

}
