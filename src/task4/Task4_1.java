package task4;

import utils.FileReader;

import static utils.ArrayConverter.stringToArray;

public class Task4_1 {
    public static FileReader fileReader;
    public static void main(String[] args) {
        fileReader = new FileReader();
        String aString = fileReader.getPropValues("properties/properties_task4.properties","a");
        String bString = fileReader.getPropValues("properties/properties_task4.properties","b");
        int[] a = stringToArray(aString);
        int[] b = stringToArray(bString);
        // declare common elements massive dimension as a.length+b.length as we don't know how many
        //common elements will be
        int[] common = new int[a.length + b.length];
        int k=0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]){
                        common[k] = a[i];
                        //counter for new common elements array, it is increased only if IF
                        // condition is true, so common elements will be displayed consistently
                        k++;

                }
            }
        }
        //now we know how quantity of common elements so we output k elements
        for (int i=0;i<k;i++){
            System.out.println(common[i]);
            }
            //this statement for the case when array don't have common elements
            if (k==0)
                System.out.print("No common elements found");
    }
}
