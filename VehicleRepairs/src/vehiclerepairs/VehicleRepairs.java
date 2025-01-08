
package vehiclerepairs;

public class VehicleRepairs {

  
    public static void main(String[] args) {
      double[][] vehicleRepairs = {
            {8000, 2500, 5000},
            {7000, 2200, 5600},
        };
      
        String[] technicians = {"Joe Bloggs", "Jane Doe"};
        
        displayArray(vehicleRepairs, technicians);
        Repairs.RepairCosts(vehicleRepairs, technicians);
        Repairs.TechnicianPay(vehicleRepairs, technicians);
        // Find and display the top earner
        String topPerfomer = Repairs.TopTechnician(vehicleRepairs, technicians);
        System.out.println("\nTop performing vehicle repair technician: " + topPerfomer);

    }
     // Method to display the sales data for each agent in a table format
    public static void displayArray(double[][] repairs, String[] names) {
        System.out.println("TECHNICIAN VEHICLE REPAIR REPORT\n");
        System.out.println("\t\t\tJAN\t\t\tFEB\t\t\tMAR");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < repairs.length; i++) {
            System.out.print(names[i] + "\t\t");
            for (int j = 0; j < repairs[i].length; j++) {
                System.out.print("R " + repairs[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
