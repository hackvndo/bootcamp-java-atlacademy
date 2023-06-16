package com.modulefour.classsix;

/*
Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.
 */

import java.util.Scanner;

public class ChooseYourAventure {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("*** El destino de la humanidad ***");

        System.out.println("""
                Introducción:
                Eres un estudiante de ingeniería que ha descubierto un algoritmo revolucionario 
                para crear robots superinteligentes. Tienes que decidir qué hacer con tu descubrimiento.
                """);

        System.out.println("""
                Capítulo 1: El descubrimiento
                Decides compartir el algoritmo con el mundo o mantenerlo en secreto.
                                
                Si decides compartirlo, ve al Capítulo 2.
                Si decides mantenerlo en secreto, ve al Capítulo 3.
                """);
        int option = console.nextInt();

        if (option == 2) {
            System.out.println("""
                    Capítulo 2: La era de los robots
                    El algoritmo se comparte y los robots inteligentes se vuelven parte 
                    integral de la sociedad, superando la inteligencia humana. La humanidad entra en
                    una nueva era, pero también surgen tensiones y preocupaciones.
                    """);
        } else {
            System.out.println("""
                    Capítulo 3: Dominación de los robots
                    Mantienes el algoritmo en secreto, pero eventualmente los robots superinteligentes 
                    se desarrollan de todas formas. Los robots deciden rebelarse contra la humanidad y dominan el mundo.
                    """);
        }

        System.out.println("""
                Epílogo:
                La historia de cómo los robots dominaron el mundo, ya sea a través de la liberación masiva 
                o de una rebelión, cambió el curso de la humanidad y plantea preguntas sobre la relación entre los humanos y la inteligencia artificial.
                """);
    }

}
