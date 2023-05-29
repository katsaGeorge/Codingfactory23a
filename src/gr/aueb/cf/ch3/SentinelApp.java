package gr.aueb.cf.ch3;
/**
 * Keeps reading until a sentinel value
 * is provided
 */


import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int counter = 0;

        System.out.println("Provide a num");
        num = in.nextInt();

        while (num !=0) {
//            System.out.println(num);
            counter++;
            System.out.println("Provide a num");
            num = in.nextInt();
        }
        System.out.println("Iterrations : "+counter);
    }
}
