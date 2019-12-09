package task7;

import utils.FileReader;

import java.io.FileNotFoundException;

public class Task_7 {
    private static FileReader fileReader;
    public static void main(String[] args) throws FileNotFoundException {
        fileReader = new FileReader();
        String str = fileReader.getPropValues("properties/properties_task7.properties","str");
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
