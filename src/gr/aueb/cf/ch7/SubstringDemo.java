package gr.aueb.cf.ch7;

public class SubstringDemo {

    public static void main(String[] args) {
        String s = "Athens Uni Of  Economics and Bus";
//        System.out.println(s.substring(0));
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i, i + 1));
        }


    }
}

