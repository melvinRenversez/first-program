package fr.mrl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int nombreATrouve = (int)(Math.random() * 100);
        
        int tentative = 1;

        System.out.println(nombreATrouve);

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.println("Entrez un nombre : ");
        int nbEntre = clavier.nextInt();


        while (nbEntre != nombreATrouve){

            if (nbEntre < nombreATrouve) {
                System.out.println("Le nombre a trouver est plus petit");
            }else{
                System.out.println("Le nombre a trouver est plus grand");
            }

            System.out.println("Entrez un nombre : ");
            nbEntre = clavier.nextInt();
            tentative += 1;

        }

        System.out.println("Bravo vous avez Trouvez au bout de " + tentative + " tentative");
        
        clavier.close();
    }    
}