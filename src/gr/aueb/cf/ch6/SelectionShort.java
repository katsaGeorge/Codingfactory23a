package gr.aueb.cf.ch6;

public class SelectionShort {

    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 14, 25, 3, 12};

        int minVal= 0;
        int minPosition = 0;
        int tmp;
        // finds the minimum
        for (int i = 0; i < arr.length - 1; i++){

            minVal = arr[i];
            minPosition = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < minVal){
                    minVal = arr[j];
                    minPosition = j;
                }
            }
            //swap
            tmp = arr[i];
            arr[i] = minVal;
            arr[minPosition] = tmp;
        }
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
