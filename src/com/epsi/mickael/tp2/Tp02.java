package com.epsi.mickael.tp2;

import java.util.Scanner;

public class Tp02 {

    private Scanner sc;
    private Parking parking = new Parking();

    public static void main(String[] args) {
        Tp02 app = new Tp02();
        app.mainLoop();
    }

    /**
     * Main loop
     */
    public void mainLoop() {
        // Initialization des variables/objet.
        this.sc = new Scanner(System.in);
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
                this.putCar();
                break;

            case "B":
                this.popCar();
                break;

            case "Q": break;

            default:
                System.out.println("Commande non reconnue !");
                break;
            }

        } while (!choice.equals("Q"));

        sc.close();
    }

    /**
     * UI to get car and put into parking.
     */
    private void putCar() {
        String ticket = null;

        System.out.println("Quel est le numéros d'immatriculation :");
        String licence = this.sc.nextLine();

        System.out.println("Quel est le nombre de place :");
        int nbPlace = Integer.parseInt(this.sc.nextLine());

        final Car car = new Car(licence, nbPlace);

        ticket = this.parking.put(car);
        System.out.println(String.format("Ticket : %s", ticket));
      }

    /**
     * UI to get car from parking (base on ticket)
     */
    private void popCar() {
        String ticket = null;

        System.out.println("Quel est votre Ticket :");
        ticket = this.sc.nextLine().toUpperCase();

        if (!ticket.isEmpty()) {

          final Car extractedCar = this.parking.pop(ticket);
          if (extractedCar != null) {
            System.out.println(String.format("Voici votre vehicule : %s", extractedCar.getLicence()));
          } else {
            System.out.println("Vehicule non trouvé");
          }
        } else {
          System.out.println("Votre ticket est invalide !");
        }
      }
}
