package task8;

import utils.FileReader;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_8 {
    public static void task_8() throws FileNotFoundException {
        String input = FileReader.fileReader("src/files/8.txt");
        Pattern template = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_*).{8,})");

        Matcher inputPassword = template.matcher(input);
        boolean isPassword = inputPassword.matches();
        System.out.print(isPassword);
    }
}
