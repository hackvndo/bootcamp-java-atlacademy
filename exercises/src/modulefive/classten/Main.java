package modulefive.classten;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Persona newPerson = new Persona(20, "Facundo Tiede", 32, "01-08-1992", 35647768);

        System.out.println(newPerson.toString());
        System.out.println(newPerson.getName() + " is over 18?: " + newPerson.isMajor());


        Scanner console = new Scanner(System.in);
        Cuenta accountOne = new Cuenta("Facundo Tiede", 10_000);

        System.out.println("Enter amount to deposit: ");
        accountOne.depositCash(console.nextInt());

        System.out.println("**************************");
        accountOne.showBalance();
        System.out.println("**************************");

        System.out.println("Enter amount to withdraw");
        accountOne.withdrawCash(console.nextInt());

        System.out.println("**************************");
        accountOne.showBalance();
        System.out.println("**************************");

    }

}
