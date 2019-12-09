package task9;

import utils.FileReader;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task_9 {
    private static FileReader fileReader;
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        fileReader = new FileReader();
        String firstDateString = fileReader
                .getPropValues("properties/properties_task9.properties","date1");
        String secondDateDateString = fileReader
                .getPropValues("properties/properties_task9.properties","date2");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        Date date1 = dateFormat.parse(firstDateString);
        Date date2 = dateFormat.parse(secondDateDateString);

        System.out.println("The first date: " + date1);
        System.out.println("The second date: " + date2);

        long milliseconds = date2.getTime() - date1.getTime();
        System.out.println("Difference between dates in milliseconds: " + milliseconds);

        int seconds = (int) (milliseconds / (1000));
        System.out.println("Difference between dates in seconds: " + seconds);

        int minutes = (int) (milliseconds / (60 * 1000));
        System.out.println("Difference between dates in minutes:  " + minutes);

        int hours = (int) (milliseconds / (60 * 60 * 1000));
        System.out.println("Difference between dates in hours: " + hours);

        int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
        System.out.println("Difference between dates in days: " + days);
    }
}
