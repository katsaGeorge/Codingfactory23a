package gr.aueb.cf.ch4;

/**
 * Αέναο loop
 */

public class SpeciaForCaseApp {

    public static void main(String[] args) {
        int counter = 0;

        for(;;){
            System.out.print("Forever ");
            counter++;
            if (counter % 10 == 0) System.out.println();
            if (counter == 100) break;
        }
    }
}
