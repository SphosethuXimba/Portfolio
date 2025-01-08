
package vehiclerepairs;


public abstract class Repairs implements IRepairs
{
     // Method to calculate and display the total sales for each agent
    public static void RepairCosts(double[][] repairs, String[] names) {
        for (int i = 0; i < repairs.length; i++) {
            double sum = 0;
            for (int j = 0; j < repairs[i].length; j++) {
                sum += repairs[i][j];
            }
            System.out.println("Total vehicle repairs for " + names[i] + " = R " + sum);
        }
        System.out.println("\n");
    }
    
     // Method to calculate and display the commission for each agent
    public static void TechnicianPay(double[][] repairs, String[] names) {
        for (int i = 0; i < repairs.length; i++) {
            double sum = 0;
            for (int j = 0; j < repairs[i].length; j++) {
                sum += repairs[i][j];
            }
            double commission = sum * 0.10; // 2% commission
            System.out.println("Sales Commission for " + names[i] + " = R " + commission);
        }
    }
    
    // Method to find the top agent based on commission
    public static String TopTechnician(double[][] repairs, String[] names) {
        double topPerfomerCommission = 0;
        String topPerfomer = "";

        for (int i = 0; i < repairs.length; i++) {
            double sum = 0;
            for (int j = 0; j < repairs[i].length; j++) {
                sum += repairs[i][j];
            }
            double commission = sum * 0.10;

            if (commission > topPerfomerCommission) {
                topPerfomerCommission = commission;
                topPerfomer = names[i];
            }
        }

        return topPerfomer;
    }

   
}
