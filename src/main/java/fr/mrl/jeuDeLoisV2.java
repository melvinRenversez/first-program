package fr.mrl;

import java.util.Random;

public class jeuDeLoisV2 {
    public static void main(String[] args) {
        boolean win = false;
        int tentative = 1;
        while (!win) {

            int caseObjectif = 20;
            int caseCourante = 0;
            int nbLancer = 5;
            Random rand = new Random();

            System.err.println("Bienvenue ! Commencons");

            for (int i = 1; i <= nbLancer; i++) {
                int lancer = rand.nextInt(6) + 1;
                caseCourante += lancer;
                System.err.println(
                        "Lancé " + i + " : vous avez fait " + lancer + " vous etes a la casse " + caseCourante);
            }

            if (caseCourante == caseObjectif) {
                System.err.println("Vous avez gagné en " + tentative + " tentative !");
                win = true;
            } else if (caseCourante > caseObjectif) {
                System.err.println("Vous avez dépassez, vous avez perdu");
                tentative++;
            } else {
                System.err.println("Il vous en manque, vous avez perdu");
                tentative++;
            }
        }

    }
}
