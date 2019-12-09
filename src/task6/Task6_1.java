// delete spaces - manual elements arrangement
package task6;

import utils.FileReader;

import java.io.FileNotFoundException;

public class Task6_1
{
    private static FileReader fileReader;
    public static void main(String[] args) throws FileNotFoundException {
        fileReader = new FileReader();
        String str = fileReader.getPropValues("properties/properties_task6.properties","str");
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
