package task4;
import java.util.Arrays;
import java.util.List;

public class Task4_2 {
    public static void task4_2(){
        Integer[] a = {1,4, 2, 3, 1};
        Integer[] b = {4,3,5,2,1};
        List<Integer> list1 = Arrays.asList(a);
        List<Integer> list2 = Arrays.asList(b);
        list1.retainAll(list2);
        System.out.println("Common elements: "+list1);

    }
}
