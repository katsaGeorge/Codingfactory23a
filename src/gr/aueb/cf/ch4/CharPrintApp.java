package gr.aueb.cf.ch4;

/**
 * Prints char Values
 */

public class CharPrintApp {

    public static void main(String[] args) {
        char ch1 = '!';
        char ch2 = '8';

        System.out.printf("char: %c, ordinal: %d\n",ch1,(int) ch1); // κάνουμε type cast για να παρουμε τον δεκαδικο
        System.out.printf("char: %c, ordinal: %d\n",ch2,(int) ch2);
    }
}
