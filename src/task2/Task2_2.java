//sum of array elements - in-built function
package task2;
import utils.FileReader;

import java.util.Arrays;
import java.util.stream.IntStream;

import static utils.ArrayConverter.stringToArray;

public class Task2_2 {
    public static FileReader fileReader;
    public static void main(String[] args) {
        fileReader = new FileReader();
        String aString = fileReader.getPropValues("properties/properties_task2.properties", "array");
        int[] myArray = stringToArray(aString);
        IntStream myArrayStream = Arrays.stream(myArray);
        //Use integer sum method.
        int sum = myArrayStream.sum();
        System.out.println(sum);
    }
}
