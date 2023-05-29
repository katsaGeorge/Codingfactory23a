package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγωντικό
 */

public class ParagontikoApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int i = 1;
        long par = 1L;
        System.out.println("Please insert an integer");
        num = in.nextInt();

        while ( i <= num){
            par *= i;
            i++;
        }
        System.out.printf("The factorial of %d is %d ",num,par);
    }
}
