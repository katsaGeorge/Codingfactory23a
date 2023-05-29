package gr.aueb.cf.ch2;

public class intPrintApp {
    public static void main(String[] args) {
        int i = 567_678_345;

      /*  System.out.print(i);
        System.out.println(i);
        System.out.printf("%d", i);

        System.out.print("Result = " + i);
        System.out.println("Result = " + i);
        System.out.printf("Result = %d%n", i); // %n -> new line as /n
        */
        System.out.printf("%,02d",i); // το κόμμα χωρίζει χιλιάδες  το 02d ορίζει ποσα μηδενικα θα βάλει μέχρι να γεμισει
        //ο αριθμός με βάση το αποτέλεσμα
    }
}
