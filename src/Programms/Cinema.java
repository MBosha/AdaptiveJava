package Programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cinema 
{
    public static void programm()
    {
        List<String> inputList = new ArrayList<>();
        byte result = 0;
        InputData.VvodTexta.inputText(inputList);   
        Integer [] sizeZal = Arrays.stream((inputList.get(0).split(" "))).map(x -> Integer.parseInt(x)).toArray(Integer[]::new);
        Zal[] zal = new Zal[sizeZal[0]];
        int kolMest = Integer.parseInt(inputList.get(inputList.size() - 1));
        for (int i = 0; i < sizeZal[0]; i++) 
        {
            List<Integer> temp = Arrays.stream((inputList.get(i + 1).split(" ")))
                    .map(x -> Integer.parseInt(x))
                    .collect(Collectors.toList());
            long free = temp.stream().filter(x -> x == 0).count();
            if (free >= kolMest)
            {
                
            }
            System.out.println(free);
            
            zal[i] = new Zal(temp);
        }   
        zal[0].getRyad().stream().forEach(x -> System.out.print(x + " "));        
        System.out.println();
        zal[1].getRyad().stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        zal[2].getRyad().stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
    
    private static class Zal
    {
        List<Integer> ryad;

        public Zal(List<Integer> ryad) 
        {
            this.ryad = ryad;
        }     

        public List<Integer> getRyad() {
            return ryad;
        }
        
    } 
}
