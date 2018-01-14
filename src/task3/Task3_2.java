package task3;

import java.util.Arrays;
import java.util.Collections;

public class Task3_2 {
    public static void task3_2() {
        Integer[] myArray = {1, 2, 4};
        //convert Integer array to array List
        Integer min = Collections.min(Arrays.asList(myArray));
        Integer max = Collections.max(Arrays.asList(myArray));

        System.out.printf("Minimum element = %s\nMaximum element = %s", min, max);
    }
}
