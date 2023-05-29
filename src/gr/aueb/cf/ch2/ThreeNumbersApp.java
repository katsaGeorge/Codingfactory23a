package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ζητάει απο τον χρήστη τρεισ ακεραίους
 * τους μειώνει κατα μί μονάδα
 * και τους εμφανίζει με την ίδια σειρά που δόθηκαν
 * αφήνοντας ΄΄ενα κενό ανάμεσα τους
 */

public class ThreeNumbersApp {
    public static void main(String[] args) {
        //δηλωση μεταβλητων
        Scanner scanner= new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //εντολές
        System.out.println("Please insert three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        num1--;
        num2--;
        num3--;

        //εμφανιση αποτελεσμάτων

        System.out.printf("%d %d %d ",num1 , num2 , num3);

    }
}
