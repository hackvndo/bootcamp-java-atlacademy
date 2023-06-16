package com.classsix;

/*
Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
Después muestra en consola la concatenación de:
“https://twitter.com/search?q=” + palabra
 */

import java.util.Scanner;

public class TweetSearch {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el nombre de una celebridad");
        String nameCelebrity = console.nextLine();

        System.out.println("https://twitter.com/search?q=" + nameCelebrity);
    }

}
