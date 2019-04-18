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
        long result = 0;
        InputData.VvodTexta.inputText(inputList);   
        if (!inputList.isEmpty()){
            Integer [] sizeZal = Arrays.stream((inputList.get(0).split(" "))).map(x -> Integer.parseInt(x)).toArray(Integer[]::new);
            int kolMest = Integer.parseInt(inputList.get(inputList.size() - 1));        
            for (int i = 0; i < sizeZal[0]; i++) 
            {
                List<Integer> temp = Arrays.stream((inputList.get(i + 1).split(" ")))
                        .map(x -> Integer.parseInt(x))
                        .collect(Collectors.toList());
                long free = temp.stream().filter(x -> x == 0).count();
                if (free >= kolMest)
                {
                    for (int j = 0; j < temp.size() - kolMest; j++) 
                    {
                        long tempLong = temp.stream().skip(j).limit(kolMest).filter(x -> x == 0).count();
                        if (tempLong == kolMest)
                        {
                            result = tempLong;
                            break;
                        }                                        
                    }                
                }
                if (result > 0)
                {
                    break;
                }
            }  
        }
       
        System.out.println(result);
    }
}
