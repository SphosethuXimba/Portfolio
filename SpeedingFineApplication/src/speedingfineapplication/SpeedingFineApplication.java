
package speedingfineapplication;
import java.util.Scanner;
public class SpeedingFineApplication 
{

    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the person name: ");
        String personName = scanner.nextLine();

        System.out.print("Enter the speed: ");
        int personSpeed = scanner.nextInt();
       
        SpeedingFines fine = new SpeedingFines(personName, personSpeed);

        fine.PrintFine();
        
        scanner.close();
    }
    
}
