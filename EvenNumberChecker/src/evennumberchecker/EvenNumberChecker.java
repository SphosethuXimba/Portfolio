
package evennumberchecker;
import java.util.Scanner;
public class EvenNumberChecker 
{

    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner (System.in);
      
      System.out.println("Enter an even number or 999 to Quit:");

      while(true)
      {
          int evenNumber=scanner.nextInt();
      if (evenNumber % 2==0 && evenNumber!=999)
      {
          System.out.println("Good Job!");
    
      }
      if (evenNumber % 2 !=0 && evenNumber!=999)
      {
          System.out.println("ERROR!");
           //System.exit(0); 
      }
       if (evenNumber==999)
      {
          System.out.println("We have reached the end of this program. Goodbye.");
          break;
        
      }
       System.out.println("Enter an even number or 999 to Quit:");
    }  
    }
}
