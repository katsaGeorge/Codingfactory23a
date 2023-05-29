package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού επιλογών μέχρι ο χρήστης να
 * επιλέξει εξοδο
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;


        do {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω");
            System.out.println("1. Εισαγωγή Προϊόντος");
            System.out.println("2. Διαγραφη Προϊόντος");
            System.out.println("3. Εξοδος");
            choice = in.nextInt();
        }while(choice!=3);

    }
}
