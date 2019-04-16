package Programms;

import InputData.VvodTexta;
import java.util.ArrayList;

public class СompressionAlgorithm 
{    
    public static void programm()
    {      
        ArrayList<String> list = new ArrayList<>();
        int count = 1;
        StringBuilder result = new StringBuilder();
        
        VvodTexta.inputText(list);
        StringBuilder sb = new StringBuilder(list.get(0));
        sb.append(" ");
        for (int i = 0; i < sb.length() - 1; i++) 
        {
            char chCurr = sb.charAt(i);
            char chNext = sb.charAt(i + 1);
            if (chCurr == chNext)
            {
                count++;
            }
            else
            {
                result.append(chCurr);
                result.append(count);
                count = 1;
            }                                
        }
        System.out.println(result);
    }
}
