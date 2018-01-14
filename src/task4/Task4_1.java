package task4;
public class Task4_1 {
    public static void task4_1() {
        int[] a = {1, 2, 3, 4, 5, 6, 2, 8};
        int[] b = {2, 4, 6, 8};
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
