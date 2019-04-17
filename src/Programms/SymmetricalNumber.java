package Programms;

import InputData.VvodTexta;


public class SymmetricalNumber 
{
    public static void programm()
    {
        String num = VvodTexta.inputOneString();
        int result = 125;
        if (num.length() > 0)
        {
            if (num.length() == 1) num = "000" + num;
            if (num.length() == 2) num = "00" + num;
            if (num.length() == 3) num = "0" + num;

            if (num.charAt(0) == num.charAt(3) && num.charAt(1) == num.charAt(2))
            {
                result = 1;                        
            }
        }
        System.out.println(result);
        System.out.println(num);
    }
    
}
