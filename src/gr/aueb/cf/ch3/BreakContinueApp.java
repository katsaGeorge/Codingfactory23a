package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει την χρήση break και Continue
 */
public class BreakContinueApp {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Provide a num");
            num = in.nextInt();
            if (num == 5){
                continue;
            }
            sum += num;
            if (num == 10){
                System.out.println("Bingo");
                break;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
