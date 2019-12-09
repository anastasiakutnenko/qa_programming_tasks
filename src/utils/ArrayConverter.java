package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayConverter {
    public static int[] stringToArray(String array) {
        String[] items = array.replaceAll("\\[", "").replaceAll("\\]", "")
                .replaceAll("\\s", "").split(",");
        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("Formatting error!!! Please use format specified in README.txt");
            }
        }
        return results;
    }

    public static List<Integer> intArrayToIntegerList(int[] intArray) {
        List<Integer> integerList  = Arrays.stream( intArray ).boxed().collect( Collectors.toList() );
        return integerList;
    }
}
