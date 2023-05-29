package gr.aueb.cf.ch5;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Υπολογίζει αν το τριγωνο είναι ορθογώνιο
 */
public class TriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double result = 0.0;
        final double EPSILON = 0.000005;

        System.out.println("Pleaser give three nums a , b , c");

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        result =  (a*a) - ( (b*b) + (c*c) );

        if ( Math.abs(result) <= EPSILON ) {
            System.out.println("The triangle is right");
        }
        else {
            System.out.println("Triangle isnt right");
        }
    }
}
