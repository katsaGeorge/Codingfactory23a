package gr.aueb.cf.ch3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Ενα αεροσκάφος εχει δυο δεξαμενες
 * Αν μια δεξαμενη εχει λιγότερο απο 1/4
 * τοτε αναβει πορτοκαλι σημα,
 * ενω αν και οι δυο δεξαμενές έχουν <1/4
 * τοτε ανάβει κόκκινο σήμα.
 * Ο πιλότος (χρήστης) δίνει false ή true
 * ανάλογα αν tank < 1/4 ή οχι ,
 * αντίστοιχα
 */

public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1 , tank2 are less tha 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: "+orangeOn);
        System.out.println("Red on: "+redOn);
    }
}


