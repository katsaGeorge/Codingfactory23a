package gr.aueb.cf.ch5;

/**
 * Ελεγχει ισότητα . ανισότητα στους floating points
 */
public class DoubleCompareApp {

    public static void main(String[] args) {
        double d1 = 0.999;
        double d2 = 1.001;
        final Double EPSILON = 0.005;

        if ((Math.abs (d2 - d1)) <= EPSILON) {
            System.out.printf("EQUAL");
        } else {
            System.out.println("NOT EQUAL");

        }

    }
}
