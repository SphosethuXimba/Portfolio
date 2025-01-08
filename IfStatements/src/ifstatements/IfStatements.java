
package ifstatements;

import java.util.Scanner;
public class IfStatements 
{
//Method to check whether the input is = 7
      public static void checkNumber(int inputNumber)
      {
          if (inputNumber==7)
          {
              System.out.println("This is my luck number");
          }
          else
          {
             System.out.println("This is not number 7"); 
          }
              
      }        
       
//New method to check age is eligible
      public static void checkAge(int inputNumber)     
      {
          if (inputNumber>=18)
          {
              System.out.println("You are eligible");
              System.out.println("Welcome to the club");
          }
          else
          {
             System.out.println("Sorry you are not eligible"); 
             System.out.println("Go to Funtubbles");
          }
              
      }       
      
//New method to check eligibility based on gender and age
      public static void checkEligibility(String gender, Scanner scanner)
      { 
          if (gender.equals("male"))
          {
              System.out.println("Please enter your age");
              int age=scanner.nextInt();
              if (age>=18)
              {
                System.out.println("You are eligibile for access");
              }
            else
            {
             System.out.println("You are not eligibile for access");
            }
              
          }  
           else
            {
             System.out.println("You are not eligibile for access");
            }    
      }   
  
    public static void main(String[] args) 
    {
     Scanner scanner = new Scanner (System.in);
     
     System.out.println("Please enter a number:");//Activity 1
     int inputNumber=scanner.nextInt();
     scanner.nextLine();
     checkNumber(inputNumber);
     
     System.out.println("Please enter your age:");//Activity 2
     int inputAge=scanner.nextInt();
     scanner.nextLine();
     checkAge(inputAge);
 
      System.out.println("Are you male or female? (Type 'male' or 'female':");//Activity 3
     String inputGender=scanner.nextLine();
     checkEligibility(inputGender,scanner);
     
     scanner.close();
    }
    
}
