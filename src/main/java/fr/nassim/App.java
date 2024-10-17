package fr.nassim;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner clavier = new Scanner(System.in);

        int chiffreAleatoire = randomNumber.nextInt(100);

        System.out.println("Je pense à un nombre entre 1 et 100, devine lequel !");
        int nbDeviner = 0;
        int nbTentatives = 0;

        while (nbDeviner != chiffreAleatoire) {
            nbTentatives = nbTentatives + 1;
            nbDeviner = clavier.nextInt();

            if (nbDeviner > chiffreAleatoire) {
                System.out.println("Votre nombre est trop grand, reessaie !");
            } else if (nbDeviner < chiffreAleatoire) {
                System.out.println("Votre nombre est trop petit, reessaie !");
            } else {
                System.out.println("Tu as gagné, bravo !");
            }
        }
        clavier.close();
        System.out.println("Tu as trouvé le bon nombre en " + nbTentatives + " tentatives");

    }

}
