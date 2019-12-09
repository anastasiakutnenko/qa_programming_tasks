//sum of array elements - manual elements arrangement
package task2;
import utils.FileReader;

import static utils.ArrayConverter.stringToArray;

public class Task2_1 {
    public static FileReader fileReader;
    public static void main(String[] args) {
        fileReader = new FileReader();
        String aString = fileReader.getPropValues("properties/properties_task2.properties", "array");
        int[] myArray = stringToArray(aString);
        int arraySum = 0;
        for (int i = 0; i < myArray.length; i++) {
            arraySum += myArray[i];
        }

        System.out.println("Sum of array elements is: " + arraySum);
    }
}