//sum of array elements - in-built function
package task2;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2_2 {
    public static void task2_2() {
     int[] myArray = {1, 2, 4};
     IntStream myArrayStream = Arrays.stream(myArray);
     //Use integer sum method.
     int sum = myArrayStream.sum();
     System.out.println(sum);
    }
}
