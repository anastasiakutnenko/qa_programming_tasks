//delete spaces - in-built function
package task6;

import utils.FileReader;

import java.io.FileNotFoundException;

public class Task6_2 {
    private static FileReader fileReader;
    public static void main(String[] args) throws FileNotFoundException {
        fileReader = new FileReader();
        String withSpaces = fileReader.getPropValues("properties/properties_task6.properties","str");
        String withoutSpaces = withSpaces.replace(" ","");
        System.out.print(withoutSpaces);


    }
}
