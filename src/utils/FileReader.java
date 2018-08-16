package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static String fileReader(String filename) throws FileNotFoundException {
    String output = "";
        File input = new File(filename);
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()){
            output = scanner.nextLine();
        }
        return output;
    }

}