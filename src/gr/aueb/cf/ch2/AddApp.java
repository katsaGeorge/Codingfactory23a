package gr.aueb.cf.ch2;
/*
Overflow
 */
public class AddApp {
    public static void main(String[] args) {
      int num1 = 2_147_483_647;
      int num2 = 2;
      int result = 0;

        //εντολες
        result = num1 + num2;

        //εμφανιση αποτελεσματων
        System.out.printf("Tο αποτελεσμα είναι %d", result);

    }
}
