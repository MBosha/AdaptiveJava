
package Programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PolygonalCurve 
{
    public static void programm()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        //ArrayList<Integer> temp;
        ArrayList<ArrayList<Integer>> massiv = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++)
        {
            massiv.add((ArrayList<Integer>) Arrays.stream(scanner.nextLine().split(" "))
                .filter(x -> x.matches("[-0-9]+"))
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList())); 
        }
        System.out.println();
        massiv.stream().forEach(x -> System.out.println(x));
        for(int i = massiv.size() - 1 ; i > 0 ; i--)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if(massiv.get(j).get(0) > massiv.get(j + 1).get(0))
                {
                    ArrayList<Integer> tmp = massiv.get(j);
                    massiv.set(j, massiv.get(j + 1));
                    massiv.set(j + 1, tmp);
                }
            }
        }
        System.out.println();
        massiv.stream().forEach(x -> System.out.println(x));
    }
}
