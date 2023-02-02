package com.epsi.mickael.tp2;

import java.util.Scanner;

public class Tp02 {

    private Parking parking = new Parking();

    public static void main(String[] args) {
        Tp02 app = new Tp02();
        app.mainLoop();
    }

    public void mainLoop() {
        // Initialization des variables/objet.
        final Scanner sc = new Scanner(System.in);
        String choice = null;

        do {
            System.out.println("Quel est l'activité :\n"
                    + "\t- A : Depose d'un vehicule\n"
                    + "\t- B : Reprise d'un vehicule\n"
                    + "\t- Q : Quitter");

            // Recupération de la saisie.
            choice = sc.nextLine().toUpperCase();

            // Analyse de la saisie.
            String ticket;
            switch (choice) {
            case "A":
                // Depose
                System.out.println("Case A");
                Car car = new Car("AAAAA", 4); // UI ???
                ticket = this.parking.put(car);
                System.out.println(String.format("Votre ticket : %s", ticket));
                break;

            case "B":
                // Recup
                System.out.println("Case B");
                // UI ????
                ticket = "AAAAA4";
                Car aCar = this.parking.pop(ticket);
                System.out.println(String.format("Voiture N° : %s", aCar.getLicence()));
                break;

            case "Q": break;

            default:
                System.out.println("Commande non reconnue !");
                break;
            }

        } while (!choice.equals("Q"));

        sc.close();
    }

}
