package task5;

import java.util.regex.Pattern;

public class Task5 {
    public static void task5(){
        String a = "Hello world world";
        String search_term = "world";
        int number_of_entries=0;
        String[] parts = a.split(Pattern.quote(" "));
        for (int i=0;i<parts.length;i++)
        {
            if(parts[i].equals(search_term)){
                ++number_of_entries;
            }
            System.out.println(parts[i]);

        }
        System.out.println(number_of_entries);

    }
}
