
package whileloop.displaymenu;

import java.util.Scanner;
public class WhileLoopDisplayMenu {

    
    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner (System.in);
      int choice;
      
      //Setup display
      while (true)
      {
          //Display your options
          System.out.println("****Main Menu****");
          System.out.println("1. Option 1");
          System.out.println("2. Option 2");
          System.out.println("3. Exit");
          System.out.println("Enter your choice: ");
          choice=scanner.nextInt();
          
          switch(choice)
          {
              case 1:
               System.out.println("You have selected Option 1");   
               break;
               
              case 2:
               System.out.println("You have selected Option 2");   
               break;
               
               case 3:
               System.out.println("Exiting the program, Bye!");   
               System.exit(0);//Terminate your program
               break;
               default:
                        System.out.println("Invalid input. Please enter a number between 1-3"); 
            }
          System.out.println(""); 
          
          
      }
           
    }
    
}
