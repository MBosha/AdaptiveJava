package Programms;

import java.io.*;       

public class TestFile 
{
    public static void programm() 
    {  
        int result = 0;
        String str = "";
       
        try 
        {
            InputStream input = new FileInputStream("input.txt");            
            int size = input.available();
            for(int i = 0; i < size; i++) 
            {
                char ch = (char)input.read();
                if (ch != ' ' && ch != '\n')
                {
                    str = str + ch;                    
                }
                if (ch == ' ' || ch == '\n' || i == size - 1)
                {
                    result = result + Integer.parseInt(str);
                    System.out.println(str);  
                    str = "";                    
                }
                          
            }            
            input.close();
        }
            catch(IOException e) 
        {
            System.out.println("нет файла input.txt");
        }      
        
        
        try 
        {
            OutputStream output = new FileOutputStream("output.txt");
            str = String.valueOf(result);
            for(int i = 0; i < str.length(); i++) 
            {
                output.write(str.charAt(i));
            }
            output.close();
        }
        catch(IOException e) 
        {
            System.out.println("output.txt");
        }
    }
}
