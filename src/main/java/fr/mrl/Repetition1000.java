package fr.mrl;

public class Repetition1000 {
    public static void main(String[] args) {
        int tentative = 1;

        boolean nbTrouver = false;
        int nbATrouver = 0;
        int nbPense = 50;
        int borneMax = 100;
        int nbBoucle = 0;
        
        
        while (nbBoucle < 10000) {
            
            nbATrouver = (int)(Math.random() * 100);
            nbPense = 50;
            borneMax = 100;
            nbTrouver = false;
            tentative = 1;

            while (!nbTrouver) {
    
                if(nbPense == nbATrouver){
                    System.out.println("Jeux : " + nbBoucle + " :: j'ai trouver " + nbATrouver + " en " + tentative + " tentative");
                    nbBoucle += 1;
                    nbTrouver = true;
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
    }
}
