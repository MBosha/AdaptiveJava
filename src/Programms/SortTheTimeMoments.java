
package Programms;

import InputData.VvodTexta;
import java.util.*;
import java.util.stream.Collectors;

public class SortTheTimeMoments 
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
        massiv.stream().forEach(x -> System.out.println(x));
    }
}
