//delete spaces - in-built function
package task6;

import utils.FileReader;

import java.io.FileNotFoundException;

public class Task6_2 {
    public static void task6_2() throws FileNotFoundException {
        String withSpaces = FileReader.fileReader("src/files/6.txt");
        String withoutSpaces = withSpaces.replace(" ","");
        System.out.print(withoutSpaces);


    }
}
