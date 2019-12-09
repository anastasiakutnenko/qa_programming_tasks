package task3;

import utils.FileReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static utils.ArrayConverter.intArrayToIntegerList;
import static utils.ArrayConverter.stringToArray;

public class Task3_2 {
    public static FileReader fileReader;
    public static void main(String[] args) {
        fileReader = new FileReader();
        String aString = fileReader.getPropValues("properties/properties_task3.properties","array");
        int[] aInt = stringToArray(aString);
        List<Integer> myArray = intArrayToIntegerList(aInt);
        Integer min = Collections.min(myArray);
        Integer max = Collections.max(myArray);

        System.out.printf("Minimum element = %s\nMaximum element = %s", min, max);
    }
}
