package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:/tmp/cf.txt");

        printMessage(ps, "Hello World");
        printMessage(System.out, "Hello Coding Factory");  //αυτό βγάζει  μήνυμα στην κονσόλα και δεν γράφει στο αρχείο λόγ System.out

        ps.println("kikikiki");

    }
    public static void printMessage(PrintStream ps,String message){
        ps.println(message);
    }
}
