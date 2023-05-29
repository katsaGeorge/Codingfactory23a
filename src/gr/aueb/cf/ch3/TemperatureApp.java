package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση την θερμοκρασια
 * Αν η θερμοκρασία ειναι μικροτερη απο 0
 * τοτε χιονίζει, αλλιώς δεν χιονίζει.
 * Ο χρήστης δίνει την θερμοκρασία
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please isnsert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0); // ειναι παρασταση συγκρισης
        System.out.println("Is snowing: "+isSnowing);
    }
}
