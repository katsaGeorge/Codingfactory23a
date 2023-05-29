package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Eναε σ μικρός βάτραχος θελει να περασει
 * ενα ποταμι. O frog βρίσκεται στην θεση χ
 * και θέλει να φτάσει στην θλεση y. (η σε θέση μεγαλύτερη απο την  > y)
 * O frog jumps a fixed distance D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 * να κάνει ωστε να φτάσει στον στόχο του
 *
 * Για παραδειγμα αν έχπυμε
 * χ = 10
 * Υ = 85
 * D = 30
 *
 * Tοτε ο small frog θα χρειαστεί  3 jumps
 */

public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int jump;
        int counter = 0;
        System.out.println("Please insert the start, the end and the jump");

        x = in.nextInt();
        y = in.nextInt();
        jump = in.nextInt();

        for ( int i = x; i <= y; i = i + jump){
            counter++;
        }
        System.out.println("The steps that needed was: " +counter);
    }
}
