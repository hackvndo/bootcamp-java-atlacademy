package com.modulefour.classsix;

/*
Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono
 */

import java.util.Scanner;

public class WhatsApp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese un numero de telefono sin espacios");
        String cellPhone = console.nextLine();

        System.out.println("https://api.whatsapp.com/send?phone=" + cellPhone);
    }

}
