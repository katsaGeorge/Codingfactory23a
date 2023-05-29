package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το αθροισμα και
 * το γινόμενο τν 10 πρώτων ακεραίων
 */
public class SumAndMull10App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int mull = 1;

        while (i <= 10){
            sum = sum +i;
            mull = mull * i;
            i++;
        }
        System.out.println("Sum: "+sum+ "\tMull: "+mull);
    }
}
