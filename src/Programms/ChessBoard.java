package Programms;

import InputData.VvodTexta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ChessBoard 
{
    public static void programm()
    {  
        Integer y;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list =Arrays.stream(VvodTexta.inputOneString().split(" "))
                .reduce((x) -> 
                {
                    list.add(Integer.parseInt(x));
                });
        System.out.println(list);
    }    
}
