package fr.mrl;

public class Repetition1000 {
    public static void main(String[] args) {
        int tentative = 1;

        boolean nbTrouver = false;
        int nbATrouver = 0;
        int nbPense = 50;
        int borneMax = 100;
        int nbBoucle = 0;
        int nbBoucleTODO = 10000;
        float moyenne = 0;
        
        
        while (nbBoucle < nbBoucleTODO) {
            
            nbATrouver = (int)(Math.random() * 100);
            nbPense = 50;
            borneMax = 100;
            nbTrouver = false;
            tentative = 1;

            while (!nbTrouver) {
    
                if(nbPense == nbATrouver){
                    nbBoucle += 1;
                    nbTrouver = true;
                    moyenne += tentative;
                }else{
        
                    if(nbPense > nbATrouver){
                        borneMax = nbPense;
                        nbPense = (int)(nbPense / 2);
                        tentative +=1;
                    }else{
                        nbPense = (int)(nbPense + ((borneMax - nbPense) / 2));
                        tentative +=1;
                    }
                }
            }
        }
        moyenne = moyenne/nbBoucleTODO;
        System.out.println("Je trouve les nombres avec un moyenne de " + moyenne + " tentative");
    }
}
