package Programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SwapTheElementsInMatrix 
{
    public static void programm()
    {
        int newValue = 0;
        List<String> inputList = new ArrayList<>();
        InputData.VvodTexta.inputText(inputList);  
        int matrixSizeY = inputList.size() - 1;       
        int matrixSizeX = 0;
        Matrix matrix = new Matrix(matrixSizeY);        
        for (int i = 0; i < matrixSizeY; i++) 
        {
            List<Integer> temp = Arrays.stream((inputList.get(i).split(" ")))
                    .map(x -> Integer.parseInt(x))
                    .collect(Collectors.toList());
            //temp.stream().forEach(x -> System.out.print(x + "\t"));
            //System.out.println();
            matrix.addRyad(i, temp);   
            matrixSizeX = temp.size();
        }
        Matrix resMatrix = new Matrix(matrixSizeX, matrixSizeY);
        
       
        for (int y = 0; y < matrixSizeY; y++) 
        {
            for (int x = 0; x < matrixSizeX; x++) 
            {
                int plusX = x + 1;
                if (plusX >= matrixSizeX) plusX = 0;
                int minusX = x - 1;
                if (minusX < 0) minusX = matrixSizeX - 1;
                int plusY = y + 1;
                if (plusY >= matrixSizeY) plusY = 0;
                int minusY = y - 1;
                if (minusY < 0) minusY = matrixSizeY - 1;
                newValue = matrix.getCell(minusX, y)+
                           matrix.getCell(plusX, y)+
                           matrix.getCell(x, minusY)+
                           matrix.getCell(x, plusY);
                System.out.print(newValue + "\t");
                //resMatrix.setCell(x, y, newValue);
                //System.out.print(resMatrix.getCell(x, y) + "\t");
            }
            System.out.println();
        }
    }
    
    private static class Matrix
    {
        Ryad [] matrix;
        
        private Matrix(int matrixSize) 
        {
            this.matrix = new Ryad[matrixSize];
        }   
        
        private Matrix(int xSize, int ySize) 
        {
            this.matrix = new Ryad[ySize];
            for (int i = 0; i < ySize; i++) 
            {
                List<Integer> temp = new ArrayList<>(xSize);                                
            }
        } 
        
        private void addRyad(int index, List<Integer> list)
        {
            this.matrix[index] = new Ryad(list);
        }   
        
        private void setCell(int x, int y, int value) 
        {
            this.matrix[y].ryad.set(x, value);
        }

        private Integer getCell(int x, int y) 
        {
            if (x >= 0 && y < this.matrix.length && y >= 0 && x < this.matrix[0].ryad.size())
            {
                return this.matrix[y].ryad.get(x);
            }
            return null;            
        }
        
        private static class Ryad
        {
            List<Integer> ryad; 

            public Ryad(List<Integer> ryad) 
            {
                this.ryad = ryad;
            }
            
        }
    }
    
}
