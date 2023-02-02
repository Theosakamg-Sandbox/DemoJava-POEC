package com.epsi.mickael.tp2;

import java.util.Scanner;

public class Tp02 {

	public static void main(String[] args) {
		Tp02 app = new Tp02();
		app.mainLoop();
	}

	public void mainLoop() {
		String choice = null;
		do {
		
			System.out.println("Quel est l'activité :\n"+
					"\t- A : Depose d'un vehicule\n"+
					"\t- B : Reprise d'un vehicule\n" +
					"\t- Q : Quitter");

			// Recupération de la saisie
			Scanner sc = new Scanner(System.in);
			choice = sc.nextLine().toUpperCase();

			switch (choice) {
			case "A":
				// Depose
				System.out.println("Case A");
				break;

			case "B":
				// Recup
				System.out.println("Case B");
				break;

			case "Q": break;

			default:
				System.out.println("Commande non reconnue !");
				break;
			}
		
		
		} while (!choice.equals("Q"));
	}

}
