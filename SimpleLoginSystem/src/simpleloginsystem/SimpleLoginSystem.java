
package simpleloginsystem;

import java.util.Scanner;
public class SimpleLoginSystem {

    
    public static void main(String[] args) 
    {
      String username="Admin" ;
      String password="A1234";
      
      Scanner scanner = new Scanner (System.in);
      int attempts=0;
      
      while (attempts<3)
      {
      System.out.println("Enter your username:");
      String enteredUsername=scanner.nextLine();
      
       System.out.println("Enter your password:");
       String enteredPassword=scanner.nextLine();
      
      if (enteredUsername.equals(username) && enteredPassword.equals(password))
      {
          System.out.println("Login Successful. Welcome " +username);
          break;//Exit the loop if the login is successful
      }
      
      else
      {
          System.out.println("Invalid credentails. Please try again");
          attempts++;//Increment the attempts
      }
      
    }
      if (attempts==3)
      {
         System.out.println("Maximum number of login attempts exceeded.");
         System.out.println("Please contact your Administrator.");
      }
      scanner.close();
      
    
 }
}