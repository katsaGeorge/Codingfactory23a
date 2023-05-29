package gr.aueb.cf.ch8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class testme3 {
    public static void main(String[] args) {
        File file = new File("C:/tmp/f1.txt"); // Αντικαταστήστε το "path_to_your_file.txt" με το πραγματικό μονοπάτι του αρχείου που θέλετε να διαβάσετε

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            int character;
            while ((character = bufferedReader.read()) != -1) {
                char currentChar = (char) character;
                // Εδώ μπορείτε να κάνετε οτιδήποτε άλλο θέλετε με τον κάθε χαρακτήρα (currentChar)
                System.out.print(currentChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
