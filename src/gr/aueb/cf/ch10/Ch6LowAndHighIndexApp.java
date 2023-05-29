package gr.aueb.cf.ch10;

/**
 * Assume an Array: {1, 2 ,3 ,4 ,4 , 4 , 6, 7 , 8, 8, 8 , 9, 9}.
 * The app returns the low and high index for a key (integer key)
 * that is included int hte array. If the key was 8 the algorithm
 * should return {7,9} or {8,10} if we make a tiny user-friendly
 * optimization.
 */

public class Ch6LowAndHighIndexApp {
    public static void main(String[] args) {

    }

    public static int [] getLowAndHighIdexOf (int[]arr, int key){
        int low =0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {};

        for( int i =0; i < arr.length; i++){
            if (arr[i] == key){
                low = i;
                break;
            }
        }
        high =low;
        pivot = low + 1;

        while (pivot < arr.length && arr[pivot++] == key){   // πρωτα ελέγχεται το arr[pivot] και μετά γίνεται ++;
            high++;
        }

        return new int[] {low, high};
    }
}
