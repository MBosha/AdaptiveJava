package Programms;

import java.util.Arrays;
import java.util.Scanner;

public class Snail 
{
    public static void programm()
    {
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[5];
        mass[3] = 0; //пройденный путь
        mass[4] = 0; //количество дней
        for (int i = 0; i < 3; i++) 
        {
            if (scanner.hasNextInt())
            {
                mass[i] = scanner.nextInt();
            }                                    
        }
        Arrays.stream(mass).forEach(x -> System.out.println(x));
        while (true) 
        {
            mass[4] = mass[4] + 1;
            mass[3] = mass[3] + mass[1];
            if (mass[3] >= mass[0])
            {
                break;
            }
            mass[3] = mass[3] - mass[2];
        }
        Arrays.stream(mass).forEach(x -> System.out.println(x));
    }    
}
