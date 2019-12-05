package task9;

import utils.FileReader;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task_9 {
    public static void differenceBetweenTwoDates() throws ParseException, FileNotFoundException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        Date date1 = dateFormat.parse("05.12.2019");
        Date date2 = dateFormat.parse("10.12.2019");

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
