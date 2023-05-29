package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Mετατρέπει euros σε δολάρια ΗΠΑ.
 * Λαμβάνει απο τον χρήστη ενα ακέραιο
 * που συμβολίζει το ποσό σε Euros και μετατρέπει
 * σε δολάρια το τελικό αποτέλεσμα
 */

public class EuropeToUsdConverterApp {
    public static void main(String[] args) {

        //Δηλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        //Εντολες
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();
        totalUsaCents = inputEuros  * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Ετύπωση αποτελεσμάτων
        System.out.printf("%d Euros = %d USA Dollars, %d USA cents", inputEuros, usaDollars , usaCents);

    }
}
