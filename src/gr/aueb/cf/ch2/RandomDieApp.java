package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int)(Math.random() *6) + 1;  // κανουμε type cast γιατι η math.random δίνει πάντα float
        System.out.println(die);

    }
}
