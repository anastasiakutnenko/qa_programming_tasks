package task4;
import utils.FileReader;
import java.util.List;

import static utils.ArrayConverter.*;


public class Task4_2 {
    public static FileReader fileReader;
    public static void main(String[] args) {
        fileReader = new FileReader();
        String aString = fileReader.getPropValues("properties/properties_task4.properties","a");
        String bString = fileReader.getPropValues("properties/properties_task4.properties","b");
        int[] aInt = stringToArray(aString);
        int[] bInt = stringToArray(bString);
        List<Integer> list1 = intArrayToIntegerList(aInt);
        List<Integer> list2 = intArrayToIntegerList(bInt);
        list1.retainAll(list2);
        System.out.println("Common elements: "+list1);
    }
}
