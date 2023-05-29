package gr.aueb.cf.ch6;

/**
 * Δηλωση , αρχικοποιηση πίνακα
 * Ppopulate (εισαγωγή στοιχείων)
 */

public class PopulateArray {

    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση πίνακα με length
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        //Εnhamced for
        for (int item : arr) {
            System.out.print(item + " ");
        }

        // unsized Initialization
        int[] arr2= {1, 5, 8, 9};

        // Array initializer
        int[] arr3;
        arr3 = new int[] {4, 6, 9, 10};
    }
}
