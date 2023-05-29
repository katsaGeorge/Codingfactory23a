package gr.aueb.cf.ch8;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class TestMe {

    public static void main(String[] args)  {



            try
                    (BufferedReader bf = new BufferedReader(new FileReader("C://tmp//f1.txt")))

        {
                int character;
                while  ((character = bf.read()) != -1) {
                  char  ch = (char) character;
                        System.out.print(ch);

                    }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
             public static boolean isNotempty(BufferedReader bf){
                String line="";

             try{
                 if ((line = bf.readLine()) != null){
                     return true;
                 }
             }catch (IOException e){
                 e.printStackTrace();
             }

                return false;
    }

    }
