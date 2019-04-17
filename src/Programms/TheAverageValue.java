package Programms;

import InputData.VvodTexta;
import java.text.BreakIterator;
import java.util.ArrayList;

public class TheAverageValue 
{
    public static void programm()
    {
        ArrayList<Integer> vvod = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        VvodTexta.inputInteger(vvod);
        if(vvod.contains(0))
        {
            for (int i = 0; i < vvod.size(); i++) 
            {
                if (vvod.get(i) != 0)
                {
                    list.add(vvod.get(i));
                }
                else
                {
                    break;
                }
            }
        }
        double num = list.size();
        double result = list.stream().reduce(0, (acc, x) -> acc + x)/ num;
        if (Double.isNaN(result)) 
        {
            result = 0;
        };
        System.out.println(result);       
    }    
}
