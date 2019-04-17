package Programms;

import InputData.VvodTexta;
import java.time.Clock;
import java.util.ArrayList;
import java.util.stream.*;

public class MultiplicationTable 
{
    public static void programm()
    {
        ArrayList<Integer> vvod = new ArrayList<>();
        VvodTexta.inputInteger(vvod);
        
        
        ArrayList<Integer> list1 = new ArrayList<>();
        IntStream.rangeClosed(vvod.get(2), vvod.get(3))
                .forEach(i -> list1.add(i));
        
        ArrayList<Integer> list2 = new ArrayList<>();
        IntStream.rangeClosed(vvod.get(0), vvod.get(1))
                .forEach(i -> list2.add(i));
        
        list1.stream().forEach(x -> System.out.print("\t" + x));
        System.out.println();
        for (int i = 0; i < list2.size(); i++) 
        {
            System.out.print(list2.get(i) + "\t");
            for (int j = 0; j < list1.size(); j++) 
            {
                System.out.print(list1.get(j) * list2.get(i) + "\t");                
            }
            System.out.println();
                        
        }
    }
}
