
package multiplicationtablegenerator;

import java.util.Scanner;

public class MultiplicationTableGenerator 
{

  
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        
        //Prompt the user for a number
        System.out.println("Enter a number to generate its multiplication table");
        int number=scanner.nextInt();
        //print table
        
        System.out.println(" Multiplication Table for: " + number);
        
        for(int i=0; i<13; i++)
        {
            int result= number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
          scanner.close();
    }
    
}
