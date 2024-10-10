package fr.mrl;

public class moyenne {
    public static void main(String[] args) {
        int tentative;
        int lastTopTentative = 0;
        int lastBottomTentative = 1000000;
        boolean nbTrouver;
        int nbATrouver;
        int estimation;
        int borneMin;
        int borneMax;
        int nbBoucle = 0;
        int nbBoucleTODO = 100000;
        float moyenne = 0;

        while (nbBoucle < nbBoucleTODO) {
            nbATrouver = (int) (Math.random() * 100);
            estimation = 50;
            borneMin = 0;
            borneMax = 100;
            nbTrouver = false;
            tentative = 0;
            
            while (!nbTrouver) {
                tentative++;
                
                if (estimation == nbATrouver) {
                    nbTrouver = true;
                    moyenne += tentative;
                    System.out.println(nbBoucle + " :: " + tentative );
                    if(tentative > lastTopTentative) {
                        lastTopTentative = tentative;
                    }
                    if(tentative < lastTopTentative) {
                        lastBottomTentative = tentative;
                    }
                } else {
                    if (estimation > nbATrouver) {
                        borneMax = estimation;
                    } else {
                        borneMin = estimation;
                    }
                    estimation = (borneMin + borneMax) / 2;
                }
            }
            nbBoucle++;
        }

        moyenne = moyenne / nbBoucleTODO;
        System.out.println(" ");
        System.out.println("Je trouve les nombres avec une moyenne de " + moyenne + " tentatives");
        System.out.println("Avec pour le plus rapide trouver en " + lastBottomTentative + " tentatives");
        System.out.println("Et pour le plus lent trouver en " + lastTopTentative + " tentatives");
        System.out.println(" ");
    }
}
