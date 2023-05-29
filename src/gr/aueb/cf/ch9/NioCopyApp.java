package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {

    public static void main(String[] args) {
        byte[] imageBytes;
        Path sourcePath = Paths.get("c:/tmp/Athens.png");
        Path targetPath = Paths.get("C:/tmp/Athensio.png");

        try{
            imageBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, imageBytes);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
