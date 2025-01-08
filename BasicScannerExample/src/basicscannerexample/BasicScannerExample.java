
package basicscannerexample;

import java.util.Scanner;
public class BasicScannerExample {
  public static void main(String[] args) 
  {//Create a scanner object to reaad input
  Scanner scanner = new Scanner (System.in);  
  
  System.out.println("Please enter your name:");//Prompt user
  String Username=scanner.nextLine();//Read user's response
  
  System.out.println("Please enter your age:");//Prompt user
  int UserAge=scanner.nextInt();//Read user's response
   
  //Display
  System.out.println("Hello " + Username + " ,you are " + UserAge +" years old. ");
  scanner.close();//Close scanner to prevent resource leak (good practice)
  }
    
}
