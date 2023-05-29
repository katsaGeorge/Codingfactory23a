package gr.aueb.cf.ch6;

public class SymmetricArray {

    public static void main(String[] args) {

    }


    public static boolean   isArraySymmetric(int[] arr){
        boolean isSymmetric = true;

        for (int i  = 0, j = arr.length - 1; i < j; i++ , j--){
            if (arr[i] != arr[j]){
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    public static boolean isArraySymmetric2(int[] arr){
            boolean isSymetric = true;
            int n = arr.length -1;
            for (int i = 0; i < n /2; i++){
                if (arr[i] != arr[n-1]){
                    isSymetric = false;
                    break;
                }
            }
            return isSymetric;
    }
}

