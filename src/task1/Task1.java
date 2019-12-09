package task1;

import utils.FileReader;

public class Task1 {
    public static FileReader fileReader;
    public static void main(String[] args) {
        int max_heart_rate;
        fileReader = new FileReader();
        String percentage100 = "Maximum pulse - 100% ";
        String percentage90 = "VO2 max zone - 90-100%(maximum load) ";
        String percentage80 = "Anaerobic zone - 80-90%(strength training) ";
        String percentage70 = "Aerobic zone - 70-80%(running, bicycle) ";
        String percentage60 = "Fat burning zone - 60-70%(fitness,roller-skates) ";
        String percentage50 = "Light activity zone - 50-60%(warm-up) ";
        String percentage0 = "Resting heart-rate 0% ";

        int age = Integer.valueOf(fileReader
                .getPropValues("properties/properties_task1.properties","age"));
        int resting_heart_rate = Integer.valueOf(fileReader
                .getPropValues("properties/properties_task1.properties","resting_heart_rate"));


        max_heart_rate = 220 - age;
        System.out.println("Your max heart rate is " + max_heart_rate);

        int target_zone_90 = (int)Math.round(max_heart_rate * 0.9);
        int target_zone_80 = (int)Math.round(max_heart_rate * 0.8);
        int target_zone_70 = (int)Math.round(max_heart_rate * 0.7);
        int target_zone_60 = (int)Math.round(max_heart_rate * 0.6);
        int target_zone_50 = (int)Math.round(max_heart_rate * 0.5);

        System.out.println(percentage100 + max_heart_rate);
        System.out.println(percentage90 + target_zone_90 + '-' + max_heart_rate);
        System.out.println(percentage80 + target_zone_80 + '-' + target_zone_90);
        System.out.println(percentage70 + target_zone_70 + '-' + target_zone_80);
        System.out.println(percentage60 + target_zone_60 + '-' + target_zone_70);
        System.out.println(percentage50 + target_zone_50 + '-' + target_zone_60);
        System.out.println(percentage0 + resting_heart_rate);
    }
}

