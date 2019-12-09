//minimum and maximum array element - manual elements arrangement
package task3;

import utils.FileReader;
import static utils.ArrayConverter.stringToArray;

public class Task3_1 {
    public static FileReader fileReader;
    public static void main(String[] args) {
        fileReader = new FileReader();
        String aString = fileReader.getPropValues("properties/properties_task3.properties","array");
        int[] myIntArray = stringToArray(aString);

        int min = myIntArray[0];
        int max = myIntArray[0];
        for(int i = 0; i < myIntArray.length; i++) {

            if (min > myIntArray[i]) {
                min = myIntArray[i];
            }
            if (max < myIntArray[i]){
                max = myIntArray[i];
            }

        }

        System.out.printf("Minimum element = %d \n", min);
        System.out.printf("Maximum element = %d", max);
    }
}
