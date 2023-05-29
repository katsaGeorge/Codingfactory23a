package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει δευτερόλεπτα σε  Days
 * hours , minutes , secs
 * ΔΕΣ ΚΑΙ ΤΟ ΠΑΡΑΔΕΙΓΜΑ ΣΤΑ PDF ΕΙΝΑΙ ΠΙΟ ΕΥΚΟΛΑ ΑΝΑΓΝΩΣΙΜΟ
 */

public class SecondsDemo {
    public static void main(String[] args) {

        //Δηλωση και αρχικοποίση
        Scanner scanner = new Scanner(System.in);
        final int DAY_SECS = 24 * 3600;
        final int HOUR_SECS = 3600;
        final int MINUTES_SECS = 60;
        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minites = 0;
        int seconds = 0;

        // Εντολες

        System.out.println("Please insert the total amount of seconds");

        inputSeconds = scanner.nextInt();
        days = inputSeconds / DAY_SECS;
        hours = (inputSeconds % DAY_SECS) / HOUR_SECS;
        minites = ((inputSeconds % DAY_SECS) % HOUR_SECS) / MINUTES_SECS;
        seconds = (((inputSeconds % DAY_SECS) % HOUR_SECS) % MINUTES_SECS);

        System.out.printf("%,d input seconds = %d days , %d hours , %d minutes , %d seconds", inputSeconds,
                days, hours, minites, seconds);



    }
}
