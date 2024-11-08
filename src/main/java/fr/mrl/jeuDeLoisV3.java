package fr.mrl;

import java.util.Random;

public class jeuDeLoisV3 {
    public static void main(String[] args) {
        boolean win = false;
        int nbLancer = 1;
        int diff;
        int lancer;
        int caseObjectif = 20;
        int caseCourante = 0;
        Random rand = new Random();

        System.err.println("Bienvenue ! Commencons");

        while (!win) {

            lancer = rand.nextInt(6) + 1;

            caseCourante += lancer;

            if (caseCourante > caseObjectif) {
                diff = caseCourante - caseObjectif;
                System.err.println("Lancé " + nbLancer + " : vous etes as " + caseCourante + ", vous avez depasser de " + diff);
                caseCourante = caseObjectif - diff;
            }

            System.err.println(
                    "Lancé " + nbLancer + " : vous avez fait " + lancer + " vous etes a la casse " + caseCourante);

            if (caseCourante == caseObjectif) {
                System.err.println("Vous avez gagné en " + nbLancer + " tentative !");
                win = true;
            }

            nbLancer++;
        }

    }
}
