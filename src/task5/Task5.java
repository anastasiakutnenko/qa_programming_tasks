package task5;

import utils.FileReader;

import java.util.regex.Pattern;

public class Task5 {
    private static FileReader fileReader;
    public static void main(String[] args) {
        fileReader = new FileReader();
        String a = fileReader.getPropValues("properties/properties_task5.properties","a");
        String search_term = fileReader
                .getPropValues("properties/properties_task5.properties","search_term");
        int number_of_entries = 0;
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