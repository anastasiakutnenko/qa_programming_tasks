//sum of array elements - manual elements arragement
package task2;
import java.util.Scanner;

public class Task2_1 {
    public static void task2_1() {
        System.out.println("Input number of array elements:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myIntArray = new int[n];
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Input a[%d]: ", i);
            myIntArray[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arraySum += myIntArray[i];
        }

        System.out.println("Sum of array elements is: " + arraySum);
    }
}