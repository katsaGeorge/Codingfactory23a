package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υΠΟΛΟΓΊΖΕΙ το παραγωντικο του n
 * (n!) με την μεθοδο facto()
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int result;
        System.out.println("Please give a num");
        num = in.nextInt();

        result = facto(num);

        System.out.printf("Result is %d", result);


    }

    /**
     * Returns n!
     *
     *
     * @param n     the number of n!
     * @return       1*2*3*4.......*n
     */
    public static int facto(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
