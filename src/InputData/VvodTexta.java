package InputData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VvodTexta
{  
    public static String inputOneString()
    {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine())    
        {
            result += scanner.nextLine();
        }
        return result;
    }
   
    public static void inputText(List<String> list)
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit)   
        {
            if (scanner.hasNextLine())
            {
                String str = scanner.nextLine();
                if (str.length() != 0)
                {
                    list.add(str);
                }
                else if (str.length() == 0)
                {
                    exit = true;
                }
            }
        }
    }    
    
    public static void inputInteger(ArrayList<Integer> list)
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit)   
        {
            if (scanner.hasNextLine())
            {
                String str = scanner.nextLine();
                if (str.length() != 0)
                {
                    if (str.matches("[0-9-]+"))
                    {
                        list.add(Integer.parseInt(str));
                    }
                }
                else if (str.length() == 0)
                {
                    exit = true;
                }
            }
        }
    }
}

/**
    public static void inputText(ArrayList<String> list)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())   
        {
            list.add(scanner.nextLine());
        }
    }
    * 
    * 
    public static void inputInteger(ArrayList<Integer> list)
    {
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextLine())   
      {
          String str = scanner.nextLine();
          if (str.length() != 0)
          {
              if (str.matches("[0-9]+"))
              {
                  list.add(Integer.parseInt(str));
              }
          }
          else if (str.length() == 0)
          {
              exit = true;
          }
      }
    }
 */
