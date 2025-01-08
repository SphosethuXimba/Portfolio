
package characterexample;
import java.util.Scanner;
public class CharacterExample
{
    
 
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner (System.in); 
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isDigit(ch))
        {
            System.out.println(ch + " is a digit!!!");
        }
        else if (Character.isLetter(ch))
        {
            System.out.println(ch + " is a letter!!!");

        }
         else if (Character.isWhitespace(ch))
        {
            System.out.println(ch + " is just whitespace.");

        }
         else
        {
            System.out.println("UNKNOWN CHARACTER");

        }
                
      scanner.close();
    }
    
}
