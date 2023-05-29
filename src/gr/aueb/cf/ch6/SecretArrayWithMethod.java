package gr.aueb.cf.ch6;

public class SecretArrayWithMethod {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println(position);
    }

    public static int getElementPosition(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;

    }
}
