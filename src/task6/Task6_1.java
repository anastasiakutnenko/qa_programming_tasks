// delete spaces - manual elements arrangement
package task6;

import utils.FileReader;

import java.io.FileNotFoundException;

public class Task6_1
{
    public static void task6_1() throws FileNotFoundException {
        String str = FileReader.fileReader("src/files/6.txt");
        String strResult = "";

        char space = ' ';
        for(int i = 0; i < str.length(); i++)
        {
            char currentChar = str.charAt(i);
            if(currentChar != space)
            {
                strResult += currentChar;
            }
        }

        System.out.println(strResult);
    }
}
