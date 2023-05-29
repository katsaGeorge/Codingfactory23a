package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένας int είναι αρτιος
 * η περιττός
 */

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean result;

        System.out.println("Please insert an int");
        num = in.nextInt();

        result = isEven(num);

        System.out.println("The number is Even: "+result);

    }

    /**
     * Evaluates an int if it is even or not
     * @param n is the number of user
     * @return true or false
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
//        if (n % 2 ==0){
//            return true;
//        }else {
//            return false;
//        }
    }
}
