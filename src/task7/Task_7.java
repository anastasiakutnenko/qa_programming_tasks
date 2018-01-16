package task7;

public class Task_7
{
    public static void task_7()
    {
      String str = "HannaH";
      String convertedToLow = str.toLowerCase();
      int n = str.length();
      int countElse = 0;
      for (int i = 0; i < n; i++)
      {

          if (convertedToLow.charAt(i) == convertedToLow.charAt(n-1-i))
          {
          }
          else{
              System.out.print("Word is not palindrome");
              countElse++;
              break;
          }
      }
      if (countElse == 0)
      {
        System.out.print("Word is palindrome");
      }
      }
    }
