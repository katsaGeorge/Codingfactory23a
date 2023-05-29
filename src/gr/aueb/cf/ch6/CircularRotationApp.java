package gr.aueb.cf.ch6;

/**
 *
 */

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] rotated = doCircularLEftShiftBy(arr, 3);
        print(rotated);

    }

    public static int[] doCircularRightSwiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] doCircularLEftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];

        }
        return rotated;
    }
    public static  void print (int[] rotated){
        for(int item : rotated)
            System.out.print(item +" ");
    }
}
