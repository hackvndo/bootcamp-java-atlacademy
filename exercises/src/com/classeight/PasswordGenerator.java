package com.classeight;

/*
Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña (por ejemplo, puedes
utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
 */

public class PasswordGenerator {

    public static void main(String[] args) {

        System.out.println("Su nueva contrasena es: " + getPassword());

    }

    public static String getPassword() {
        int length = 10; // Longitud de contrasena deseada
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+"; //
        // Caracteres validos
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();

    }
}

