package utils;

import com.oracle.tools.packager.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class FileReader {
    public String result;
    public String fileReader(String filename) throws FileNotFoundException {
    String output = "";
        File input = new File(filename);
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()){
            output = scanner.nextLine();
        }
        return output;
    }
    public String getPropValues(String fileName, String property) {
        String propFileName = fileName;
        Properties prop;

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName)) {
            prop = new Properties();

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            result = prop.getProperty(property);
            Log.info("property file: " + propFileName + "; property: " + result);
        } catch (Exception e) {
            Log.info("Exception: " + e);
        }

        return result;
    }

}