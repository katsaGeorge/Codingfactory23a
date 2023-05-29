package gr.aueb.cf.ch1;
/*
*Προσθέτουμε δύο ακεραίους
* και εμφανίζει το αποτέλεσμα
* στο stdout
*
 */
public class AddApp {
    public static void main(String[] args) {

        //  δήλωση και αρχικοποιήση μεταβλητών
        int num1 = 10;
        int num2 = 7;
        int result = 0 ;

        //εντολές
        result = num1 + num2;


        //εκτύπωση αποτελεσμάτων
        System.out.println("Tο αποτέλεσμα είναι: " + result);
        System.out.printf("Το αποτέλεσμα των %d , %d είναι %d ", num1, num2, result );
    }

}

