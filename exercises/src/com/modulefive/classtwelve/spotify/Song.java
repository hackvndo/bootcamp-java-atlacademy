package com.modulefive.classtwelve.spotify;

/*
Armar un programa que funcione como una lista de reproducción de Spotify simple: El programa debe permitir
al usuario agregar canciones a una lista de reproducción. Cada canción debe tener atributos como título, artista
y duración. El programa debe permitir reproducir las canciones en orden y mostrar la información de la canción que se
está reproduciendo en ese momento.
 */

public class Song {
    private String title;
    private String artist;
    private int time;


    public Song(String title, String artist, int time) {
        this.title = title;
        this.artist = artist;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }



}
