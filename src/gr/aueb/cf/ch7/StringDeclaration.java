package gr.aueb.cf.ch7;

public class StringDeclaration {

    public static void main(String[] args) {
        String alice ="Alice";
        String alice2 = "Alice";
        String bob = new String("Bob");
        int index = -1;

        index = alice.indexOf("ce");
        System.out.println(index);

//        System.out.println(alice);
//        System.out.printf("%s\n", alice2);
//        System.out.println(alice + " " + bob);
//        System.out.println(alice.length() + bob.length());
    }
}
