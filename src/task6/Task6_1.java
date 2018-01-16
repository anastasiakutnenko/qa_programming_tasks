package task6;

public class Task6_1
{
    public static void task6_1()
    {
        String str = "Have a nice weekend";
        String strResult = "";

        char space = ' ';
        for(int i = 0; i < str.length(); i++)
        {
            char currentChar = str.charAt(i);
            if(currentChar != space)
            {
                strResult += currentChar;
            }
        }

        System.out.println(strResult);
    }
}
