package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρισκει τον μέσο όρο της βαθμολογίας ενός μαθητή
 * Παρέχοντα τα total και τα count
 */

public class AverageApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0 ;
        int count = 0;
        int average = 0;

        System.out.println("Please provide total και count");
        total = in.nextInt();
        count = in.nextInt();

        if (count == 0){
            System.out.println("Invalid count");
            System.exit(1); // διακόπτει το πρόγραμμα
        }

        if (total < 0){
            System.out.println("Invalid total");
            System.exit(1); // διακόπτει το πρόγραμμα
        }

        average = total / count;

        if (average > 10){
            System.out.println("Invalid Average");
            System.exit(1);
        }

        if (average >= 9){
            System.out.println("Excellent");
        }else if (average >= 7 ){
            System.out.println("Very good");
        } else if (average >=5) {
            System.out.println("Good");
        }else {
            System.out.println("Fail");
        }

    }
}
