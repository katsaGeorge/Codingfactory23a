package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το a^n.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int a;
        int n;
        int result;


        System.out.println("Please insert two nums");
        a = in.nextInt();
        n = in.nextInt();
        result = pow( a, n);

        System.out.println("The result is:" +result);

    }

    /**
     * Returns the power of an int
     * @param a  the base
     * @param n  the power to raise
     * @return  the power of a^n
     */

    public static int pow(int a, int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= a;
        }
        return  result;
    }
}
