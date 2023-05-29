package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ενα δυψήφιο ακέραιο
 * και βρισκουμε το άθριοιμα των δύο ψηφίων
 */

public class IntTwoDigitsApp {
    public static void main(String[] args) {
        //δηλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0 ;
        int rightDigit = 0 ;
        int sumDigits = 0;

        //εντολές
        System.out.println("Please insert a number with two digits");
        num = in.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;
        sumDigits = leftDigit + rightDigit;

        //εκτυοωση αποτελεσμάτων
        System.out.printf("Sum: %d",sumDigits);
    }
}
