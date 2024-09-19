package fr.mrl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez votre nom :");
        String nomUtilisateur = clavier.nextLine();

        System.out.println("Entrez le nom d'un ou plusieurs object que vous possédez");
        String objetPossedez = clavier.nextLine();

        System.out.println("Entrez le nombre de fois que vous possédez cette objet");
        String nombreObjetPossede = clavier.nextLine();

        System.out.println("Entrez comment cela vous rend");
        String humeur = clavier.nextLine();
        
        System.out.println("il etait une fois " + nomUtilisateur + " qui avait " + nombreObjetPossede + " " + objetPossedez + ". Cela le rendait tres " + humeur);
        
        clavier.close();
    }    
}