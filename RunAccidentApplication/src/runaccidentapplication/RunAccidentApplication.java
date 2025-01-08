
package runaccidentapplication;
import java.util.Scanner;

public class RunAccidentApplication 
{

   
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the accident vehicle type: ");
        String AccidentVehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle acidents: ");
        String City = scanner.nextLine();

        System.out.print("Enter the total Car accidents for Cape Town: ");
        int AccidentTotal = scanner.nextInt(); 
        
        RoadAccidentReport RoadAccidentReport = new RoadAccidentReport(AccidentVehicleType, City, AccidentTotal);

        RoadAccidentReport.printAccidentReport(); 
        
        scanner.close();
    }
    
}
