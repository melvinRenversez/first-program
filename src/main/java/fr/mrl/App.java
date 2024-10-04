package fr.mrl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int tentative = 1;

        boolean nbEntre = false;
        boolean nbTrouver = false;
        String plusMoin = "";
        int nbATrouver = 0;
        int nbPense = 50;
        int borneMax = 100;
        
        System.out.println("Entrez le nombre que je vais devoir devine entre 0 et 100");

        while (!nbEntre) {
            nbATrouver = clavier.nextInt();
            if (nbATrouver >= 0 && nbATrouver <= 100) {
                nbEntre = true;
            }else{
                System.out.println("votre nombre n'est pas comprit enter 0 et 100");
            }
        }

        System.out.println(nbATrouver);


        while (!nbTrouver) {
            System.out.println("je pense a " + nbPense);

            if(nbPense == nbATrouver){
                System.out.println("j'ai trouver en " + tentative+ " bien jouer a toi");
                nbTrouver = true;
            }else{
                System.out.println("Votre nombre est il plus grand ou plus petit ( + ou - )");
                plusMoin = clavier.nextLine();

                System.out.println("pm " + plusMoin);
    
                if(plusMoin.equals("-")){
                    System.err.println("moin");
                    borneMax = nbPense;
                    nbPense = (int)(nbPense / 2);
                    tentative +=1;
                }else if(plusMoin.equals("+")){
                    borneMin = nbPense;
                    nbPense = (int)(nbPense + ((borneMax - nbPense) / 2));
                    tentative +=1;
                }else{
                    System.out.println("viellez choisir ( + ou - )");
                }
            }


        }
        
        clavier.close();
    }    
}