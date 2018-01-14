//minimum and maximum array element - manual elements arrangement
package task3;

import java.util.Scanner;

public class Task3_1 {
    public static void task3_1 (){
        System.out.println("Input number of array elements:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myIntArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Input a[%d]: ", i);
            myIntArray[i] = scan.nextInt();
        }

        int min = myIntArray[0];
        int max = myIntArray[0];
        for(int i = 0; i < n; i++) {

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
