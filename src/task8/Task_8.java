package task8;

import utils.FileReader;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_8 {
    private static FileReader fileReader;
    public static void main(String[] args) throws FileNotFoundException {
        fileReader = new FileReader();
        String input = fileReader.getPropValues("properties/properties_task8.properties","password");
        Pattern template = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_*).{8,})");

        Matcher inputPassword = template.matcher(input);
        boolean isPassword = inputPassword.matches();
        System.out.print(isPassword);
    }
}
