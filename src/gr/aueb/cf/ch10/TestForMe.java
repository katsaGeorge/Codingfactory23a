package gr.aueb.cf.ch10;

public class TestForMe {


    public static void main(String[] args) {
        StringBuilder in = new StringBuilder();
        double a = 2.456;
        double b = 3.56789;

        String s = "Coding Factory";

        System.out.println(Math.ceil(b/a));
            System.out.print(change(in,s));
    }
    public static String change(StringBuilder in, String s){
        char ch;
        for (int i = 0; i < s.length(); i++ ){
            ch = s.charAt(i);
            in.append(ch);
        }

        return in.toString();
    }
}
