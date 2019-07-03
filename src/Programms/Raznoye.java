/*

import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        int m = scaner.nextInt();
        int k = scaner.nextInt();
        if ((k <= m*n) && (k % n == 0 || k % m == 0)) 
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");            
        }
        
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> massiv = new ArrayList<ArrayList<Integer>>(n);
        scanner.nextLine();
        for (int i = 0; i < n; i++)
        {
            massiv.add((ArrayList<Integer>) Arrays.stream(scanner.nextLine().split(" "))
                .filter(x -> x.matches("[-0-9]+"))
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList())); 
        }        
        massiv.stream().forEach(x -> System.out.println(x));    
        System.out.println();
        for(int i = massiv.size() - 1 ; i > 0 ; i--)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if(massiv.get(j).get(0) > massiv.get(j + 1).get(0))
                {
                    change(massiv, j);
                    //ArrayList<Integer> tmp = massiv.get(j);
                    //massiv.set(j, massiv.get(j + 1));
                    //massiv.set(j + 1, tmp);
                }
                if(massiv.get(j).get(0) == massiv.get(j + 1).get(0))
                {
                    if(massiv.get(j).get(1) > massiv.get(j + 1).get(1))
                    {
                        change(massiv, j);                        
                    }   
                    if(massiv.get(j).get(1) == massiv.get(j + 1).get(1))
                    {
                        if(massiv.get(j).get(2) > massiv.get(j + 1).get(2))
                        {
                            change(massiv, j);
                        }
                    }
                }
            }
        }
        massiv.stream().forEach(x -> System.out.println(x)); 
    }
    
    private static ArrayList<ArrayList<Integer>> change (ArrayList<ArrayList<Integer>> massiv, int j)
    {
        ArrayList<Integer> tmp = massiv.get(j);
        massiv.set(j, massiv.get(j + 1));
        massiv.set(j + 1, tmp);
        return massiv;        
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        list = Arrays.stream(scanner.nextLine().split(" "))
            .filter(x -> x.matches("[-0-9]+"))
            .map(x -> Integer.parseInt(x))
            .collect(Collectors.toList());   
        if (list.size() == 1)
        {
            result = list;
        }
        else
        {
            for(int i = 0 ; i < list.size(); i++)
            {
                if (i == 0)
                {
                    result.add(list.get(1) + list.get(list.size() - 1));
                }
                else if (i == list.size() - 1)
                {
                    result.add(list.get(0) + list.get(list.size() - 2));
                }
                else if (0 < i && i < list.size() - 1)
                {
                    result.add(list.get(i - 1) + list.get(i + 1));
                }
                
            }
        }
        result.stream().forEach(x -> System.out.print(x + " ")); 
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);        
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.nextLine();
        ArrayList<ArrayList<Integer>> massiv = new ArrayList<ArrayList<Integer>>(row);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(col);
        
        for(int i = 0 ; i < row; i++)
        {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp = (ArrayList<Integer>)Arrays.stream(scanner.nextLine().split(" "))
            .filter(x -> x.matches("[-0-9]+"))
            .map(x -> Integer.parseInt(x))
            .collect(Collectors.toList()); 
            massiv.add(tmp);            
        }
        for(int i = 0 ; i < col; i++)
        {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int j = 0 ; j < row; j++)
            {
                Integer tmpInt = massiv.get(j).get(i);
                tmp.add(tmpInt);                
            }            
            result.add(tmp);
        }
        massiv.stream().forEach(x -> 
                                {
                                    x.stream().forEach(y -> System.out.print(y + " "));
                                    System.out.println();
                                }); 
        result.stream().forEach(x -> 
                                {
                                    x.stream().forEach(y -> System.out.print(y + " "));
                                    System.out.println();
                                });
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        Map<String, Integer> result = new HashMap<>();
        list = Arrays.stream(scanner.nextLine().split(" "))
            .map(x -> x.toLowerCase())
            .collect(Collectors.toList()); 
        while (list.size() > 0)
        {
            String strTemp = list.get(0);
            long count = list.stream()
                .filter(x -> strTemp.equals(x))
                .count();
            result.put(strTemp, (int)count);
            while (list.indexOf(strTemp) != -1)
            {
                list.remove(list.indexOf(strTemp));                
            }
        }
        
        for (Map.Entry<String, Integer> pair : result.entrySet()) 
        {
            System.out.println( pair.getKey() + " "  + pair.getValue());
        }
    }
}

import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        String result1 = "";
        String result2 = "";
        Map<String, String> mapKeyShifr = new HashMap<>();
        Map<String, String> mapKeyDeshifr = new HashMap<>();
        for(int i = 0 ; i < str1.length(); i++)
        {
            mapKeyShifr.put(str1.substring(i, i + 1), str2.substring(i, i + 1));  
            mapKeyDeshifr.put(str2.substring(i, i + 1), str1.substring(i, i + 1)); 
        }
        for(int i = 0 ; i < str3.length(); i++)
        {
            String symbol = str3.substring(i, i + 1);
            result1 = result1 + mapKeyShifr.get(symbol);     
        }
        for(int i = 0 ; i < str4.length(); i++)
        {
            String symbol = str4.substring(i, i + 1);
            result2 = result2 + mapKeyDeshifr.get(symbol);     
        }
        System.out.println(result1);
        System.out.println(result2);
    }
}

import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        int m = scaner.nextInt();
        int k = scaner.nextInt();
        if ((k <= m*n) && (k % n == 0 || k % m == 0)) 
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");            
        }
        
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> massiv = new ArrayList<ArrayList<Integer>>(n);
        scanner.nextLine();
        for (int i = 0; i < n; i++)
        {
            massiv.add((ArrayList<Integer>) Arrays.stream(scanner.nextLine().split(" "))
                .filter(x -> x.matches("[-0-9]+"))
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList())); 
        }        
        massiv.stream().forEach(x -> System.out.println(x));    
        System.out.println();
        for(int i = massiv.size() - 1 ; i > 0 ; i--)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if(massiv.get(j).get(0) > massiv.get(j + 1).get(0))
                {
                    change(massiv, j);
                    //ArrayList<Integer> tmp = massiv.get(j);
                    //massiv.set(j, massiv.get(j + 1));
                    //massiv.set(j + 1, tmp);
                }
                if(massiv.get(j).get(0) == massiv.get(j + 1).get(0))
                {
                    if(massiv.get(j).get(1) > massiv.get(j + 1).get(1))
                    {
                        change(massiv, j);                        
                    }   
                    if(massiv.get(j).get(1) == massiv.get(j + 1).get(1))
                    {
                        if(massiv.get(j).get(2) > massiv.get(j + 1).get(2))
                        {
                            change(massiv, j);
                        }
                    }
                }
            }
        }
        massiv.stream().forEach(x -> System.out.println(x)); 
    }
    
    private static ArrayList<ArrayList<Integer>> change (ArrayList<ArrayList<Integer>> massiv, int j)
    {
        ArrayList<Integer> tmp = massiv.get(j);
        massiv.set(j, massiv.get(j + 1));
        massiv.set(j + 1, tmp);
        return massiv;        
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        list = Arrays.stream(scanner.nextLine().split(" "))
            .filter(x -> x.matches("[-0-9]+"))
            .map(x -> Integer.parseInt(x))
            .collect(Collectors.toList());   
        if (list.size() == 1)
        {
            result = list;
        }
        else
        {
            for(int i = 0 ; i < list.size(); i++)
            {
                if (i == 0)
                {
                    result.add(list.get(1) + list.get(list.size() - 1));
                }
                else if (i == list.size() - 1)
                {
                    result.add(list.get(0) + list.get(list.size() - 2));
                }
                else if (0 < i && i < list.size() - 1)
                {
                    result.add(list.get(i - 1) + list.get(i + 1));
                }
                
            }
        }
        result.stream().forEach(x -> System.out.print(x + " ")); 
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);        
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.nextLine();
        ArrayList<ArrayList<Integer>> massiv = new ArrayList<ArrayList<Integer>>(row);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(col);
        
        for(int i = 0 ; i < row; i++)
        {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp = (ArrayList<Integer>)Arrays.stream(scanner.nextLine().split(" "))
            .filter(x -> x.matches("[-0-9]+"))
            .map(x -> Integer.parseInt(x))
            .collect(Collectors.toList()); 
            massiv.add(tmp);            
        }
        for(int i = 0 ; i < col; i++)
        {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int j = 0 ; j < row; j++)
            {
                Integer tmpInt = massiv.get(j).get(i);
                tmp.add(tmpInt);                
            }            
            result.add(tmp);
        }
        massiv.stream().forEach(x -> 
                                {
                                    x.stream().forEach(y -> System.out.print(y + " "));
                                    System.out.println();
                                }); 
        result.stream().forEach(x -> 
                                {
                                    x.stream().forEach(y -> System.out.print(y + " "));
                                    System.out.println();
                                });
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        Map<String, Integer> result = new HashMap<>();
        list = Arrays.stream(scanner.nextLine().split(" "))
            .map(x -> x.toLowerCase())
            .collect(Collectors.toList()); 
        while (list.size() > 0)
        {
            String strTemp = list.get(0);
            long count = list.stream()
                .filter(x -> strTemp.equals(x))
                .count();
            result.put(strTemp, (int)count);
            while (list.indexOf(strTemp) != -1)
            {
                list.remove(list.indexOf(strTemp));                
            }
        }
        
        for (Map.Entry<String, Integer> pair : result.entrySet()) 
        {
            System.out.println( pair.getKey() + " "  + pair.getValue());
        }
    }
}

import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        String result1 = "";
        String result2 = "";
        Map<String, String> mapKeyShifr = new HashMap<>();
        Map<String, String> mapKeyDeshifr = new HashMap<>();
        for(int i = 0 ; i < str1.length(); i++)
        {
            mapKeyShifr.put(str1.substring(i, i + 1), str2.substring(i, i + 1));  
            mapKeyDeshifr.put(str2.substring(i, i + 1), str1.substring(i, i + 1)); 
        }
        for(int i = 0 ; i < str3.length(); i++)
        {
            String symbol = str3.substring(i, i + 1);
            result1 = result1 + mapKeyShifr.get(symbol);     
        }
        for(int i = 0 ; i < str4.length(); i++)
        {
            String symbol = str4.substring(i, i + 1);
            result2 = result2 + mapKeyDeshifr.get(symbol);     
        }
        System.out.println(result1);
        System.out.println(result2);
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        List<String> list = new ArrayList<String>();
        list = Arrays.stream(scanner.nextLine().split(" "))
            .map(x -> x.toLowerCase())
            .collect(Collectors.toList()); 
        double num= list.stream()
            .filter(x -> x.equals("a"))
            .count() / (double)list.size(); 
        System.out.println(num);
    }
}

//1.154 From Roman system into the decimal
import java.util.*;
import java.util.stream.Collectors;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        List<String> list = new ArrayList<String>();
        if (scanner.hasNextLine())
        {
            list = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList()); 
        }
        int result = 0;
        for(int i = 0 ; i < list.size() - 1; i++)
        {
            String tmp = list.get(i) + list.get(i + 1); 
            if (doubleChar(tmp) != -1)
            {
                result = result + doubleChar(tmp);
                list.remove(i);
                list.remove(i);
                i--;
            }
            System.out.println(tmp + " " + result);
            tmp = "";                
        }
        for(int i = 0 ; i < list.size(); i++)
        {
            result = result + singleChar(list.get(i).charAt(0));    
            System.out.println(list.get(i).charAt(0) + " " + result);
        }
        System.out.println();  
        System.out.println(result);
    }
    
    private static int doubleChar (String str)
    {
        switch (str) {
                case "IV":
                return 4;
                case "IX":
                return 9;
                case "XL":
                return 40;
                case "XC":
                return 90;
                case "CD":
                return 400;
                case "CM":
                return 900;
        }
        return -1;
    }
    private static int singleChar (char ch)
    {
        switch (ch) {
                case 'I':
                return 1;
                case 'V':
                return 5;
                case 'X':
                return 10;
                case 'L':
                return 50;
                case 'C':
                return 100;
                case 'D':
                return 500;
                case 'M':
                return 1000;
        }
        return 0;
    }
}




*/
