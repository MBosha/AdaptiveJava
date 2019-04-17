package Programms;

import InputData.VvodTexta;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChessBoard 
{
    public static void programm()
    {  
        String result = "NO";
        List<Integer> list = Arrays.stream(VvodTexta.inputOneString().split(" "))
                .filter(x -> x.matches("[0-9]+"))
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList()); 
        System.out.println(list);
        int x1 = list.get(0);
        int y1 = list.get(1);
        int x2 = list.get(2);
        int y2 = list.get(3);
        //x y-1
        //y x+1
        //x y+1
        //y x-1
        if (x1 == x2 || y1 == y2)
        {
            result= "YES";
            System.out.println("1");
        }
        for (int i = 1; i < 9; i++) 
        {
            //x+1 y-1
            if (x1 + i == x2 && y1 - i == y2)
            {
                result= "YES";
                System.out.println("2");
                break;
            }    
            //x+1 y+1
            if (x1 + i == x2 && y1 + i == y2)
            {
                result= "YES";
                System.out.println("3");
                break;
            } 
            //x-1 y+1
            if (x1 - i == x2 && y1 + i == y2)
            {
                result= "YES";
                System.out.println("4");
                break;
            }
            //x-1 y-1
            if (x1 - i == x2 && y1 - i == y2)
            {
                result= "YES";
                System.out.println("5");
                break;
            }
        }        
        System.out.println(result);
    }    
}
