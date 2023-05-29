package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 */
public class FlushApp {

    public static void main(String[] args) {

        double g = 1.8;

      try {
          PrintStream ps = new PrintStream("C:/tmp/flush-file.txt");
          ps.printf("Hello %.1f\nkakaka",g);
//          ps.flush();

          ps.close();
      }catch (FileNotFoundException e){
          System.out.println("file not found");
      }

    }
}
