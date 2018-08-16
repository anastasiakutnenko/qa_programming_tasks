package task7;

import utils.FileReader;

import java.io.FileNotFoundException;

public class Task_7 {
    public static void task_7() throws FileNotFoundException {
        String str = FileReader.fileReader("src/files/7.txt");
        String convertedToLow = str.toLowerCase();
        int n = str.length();
        boolean notPalindromeFlag = false;

        for (int i = 0; i < n && notPalindromeFlag == false; i++) {

            if (convertedToLow.charAt(i) != convertedToLow.charAt(n - 1 - i)) {
                System.out.print("Word is not palindrome");
                notPalindromeFlag = true;
            }

        }

        if (notPalindromeFlag == false) {
            System.out.print("Word is palindrome");
        }
    }
}
