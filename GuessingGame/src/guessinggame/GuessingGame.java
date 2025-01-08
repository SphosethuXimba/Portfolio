
package guessinggame;

import java.util.Scanner;
import java.util.Random;
//import java.util*
public class GuessingGame
{

  
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner (System.in);
      Random random= new Random();
      
      int randNumber=random.nextInt(51);
      //generate a random number between0(inclusivw) and 11(exclusive)
      //which means generate numbers from 0 to 10
      int userGuess;
      int attempts=0;
      System.out.println("Welcome to the Guessing game!");
      
      do
      {
          System.out.println("Enter your guess(Between 1 and 50):");
          userGuess=scanner.nextInt();
          attempts++;
          
          if (userGuess<randNumber)
          {
              System.out.println("Number is too low, try again:");
          }
          else if (userGuess>randNumber)
          {
              System.out.println("Number is too high, try again:"); 
          }
      }
      while(userGuess != randNumber);
      System.out.println("You guessed the correct number:" + randNumber);
      System.out.println("Number of attempts:" + attempts);
      scanner.close();
    }
    
}
