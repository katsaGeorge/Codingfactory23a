package gr.aueb.cf.ch2;



public class TypecastApp {

    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;


        num1 = (int) num2; // typecast κανει το num2 τύπου int


        result = num1 + num2; // Οταν  έχουμε παρασταση με διάφορους τυπους μετατρέπομται αυτόματα οι μικροτεροι  τύποι
        //σε μεγαλύτερους  π.χ εδω το num1 γίνεται long

    }
}
