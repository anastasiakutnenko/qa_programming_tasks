package task10;

import utils.FileReader;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class Task10 {
    private static FileReader fileReader;
    public static void main(String[] args) throws FileNotFoundException {
        fileReader = new FileReader();
        int year = Integer.valueOf(fileReader
                .getPropValues("properties/properties_task10.properties","year"));

        LocalDate localDate = LocalDate.of(year, 01, 01);
        LocalDate programmersDayDate = localDate;
        if(year % 4 == 0) {
            if((year % 100 == 0) || (year % 400 == 0)) {
                programmersDayDate = localDate.plusDays(256);
            }
            else {
                programmersDayDate = localDate.plusDays(255);
            }
        }
        else {
            programmersDayDate = localDate.plusDays(255);
        }
        System.out.println(programmersDayDate);
        System.out.println(String.format("Programmers Day in %d year will be on ", year) + programmersDayDate.getDayOfWeek());
    }
}
