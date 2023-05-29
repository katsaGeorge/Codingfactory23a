package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Demostrates the Usage of Exceptions.
 */
public class ExceptApp {

    public static void main(String[] args) throws IOException  {

        int ch = getNextChar();



    }
       public static int getNextChar() throws IOException {
        int ch =' ';

           try {
                ch = System.in.read();
           }catch (IOException e){
             e.printStackTrace();
               throw e;
           }
           return ch;

       }
}
