package com.modulefive.classtwelve.spotify;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private List<Song> songs;
    private int actualIndex;

    public PlayList() {
        songs = new ArrayList<>();
        actualIndex = 0;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void playSong() {
        if (songs.isEmpty()) {
            System.out.println("The Play List is empty");
            return;
        }

        Song actualSong = songs.get(actualIndex);
        System.out.println("Playing: " + actualSong.getTitle() + " - " + actualSong.getArtist());
        System.out.println("Duration: " + actualSong.getTime() + " seconds");

        actualIndex++;
        if (actualIndex >= songs.size()) {
            actualIndex = 0;
        }
    }


}
