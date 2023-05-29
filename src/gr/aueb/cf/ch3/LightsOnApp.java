package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Αποφασίζει  αν πρέπει να αναψουν τα φώτα ενός
 * αυτοκινήτου με βάση τρεις μεταβλητές:
 * Αν βρέχει ΚΑΙ ΤΑΥΤΟΧΡΟΝΑ ισχύει ένα τουλάχιστον
 * απο τα επόμενα: είναι σκοτάδι ή τρέχουμε
 * (speed >100). Tις τιμές  αυτές τις λαμβάνουμε απο τον χρήστη
 */

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is rainning (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if its is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        speed = in.nextInt();
        isRunning = (speed > 100);

        lightsOn = isRaining && ( isDark || isRunning );

        System.out.println("Lights on: " + lightsOn);
    }
}
