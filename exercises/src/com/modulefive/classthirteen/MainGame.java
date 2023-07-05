package com.modulefive.classthirteen;

/*
Crea una clase base llamada "Personaje" con atributos como nombre, nivel y puntos de vida. Implementa métodos para que el personaje pueda atacar, recibir daño y curarse.
Luego, crea clases derivadas como "Guerrero", "Mago" y "Arquero", que hereden de la clase base y añadan atributos y métodos específicos para cada tipo de personaje.
Por ejemplo, la clase "Guerrero" podría tener un atributo adicional para la fuerza de ataque, mientras que la clase "Mago" podría tener un método para lanzar hechizos.
 Crea instancias de los diferentes personajes y simula un combate entre ellos.
Puedes añadir más funcionalidades al juego de rol, como habilidades especiales, armas, armaduras, y enemigos con los que los personajes pueden luchar. La idea es que te
diviertas creando y personalizando tu propio juego de rol utilizando la herencia y el polimorfismo en la programación orientada a objetos.
 */

public class MainGame {
    public static void main(String[] args) {
        Knight knight = new Knight("Sauron", 99, 500, 50);
        Wizard wizard = new Wizard("Gandalf", 87, 390, 300);

        System.out.println("----- Battle Starts -----");
        System.out.println(knight.name + " vs " + wizard.name);

        while (knight.life > 0 && wizard.life > 0) {
            // Knight turn
            int knightDamage = knight.attack();
            wizard.damageReceived(knightDamage);
            System.out.println(wizard.name + " remaining life: " + wizard.life);

            // Wizard Turn
            int wizardDamage = wizard.specialAbility();
            knight.damageReceived(wizardDamage);
            System.out.println(knight.name + " remaining life: " + knight.life);

            // Auto health
            wizard.autoHealth();

            System.out.println("---------------------");
        }

        System.out.println("----- Battle Starts -----");
        System.out.println("Final Results:");
        System.out.println(knight.name + " life: " + knight.life);
        System.out.println(wizard.name + " life: " + wizard.life);
    }

}
