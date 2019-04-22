package Programms;

import java.util.ArrayList;

public class MKAD 
{
    public static void programm()
    {
        ArrayList<Integer> list = new ArrayList<>();
        InputData.VvodTexta.inputInteger(list);
        int speed = list.get(0);
        int hours = list.get(1);
        int dist = speed * hours;
        System.out.println(speed + " * " + hours + " = " + dist); 
        if (Math.abs(dist) < 109 && dist > 0)
        {
            System.out.println("Ответ_1: " + (dist));
        }
        if (Math.abs(dist) < 109 && dist < 0)
        {
            System.out.println("Ответ_2: " + (109 + dist));
        }
        if (Math.abs(dist) > 109 && dist > 0)
        {
            System.out.println("Ответ_3: " + (dist % 109));
        }
        if (Math.abs(dist) > 109 && dist < 0)
        {
            System.out.println("Ответ_4: " + (109 + dist % 109));
        }
    }
}
