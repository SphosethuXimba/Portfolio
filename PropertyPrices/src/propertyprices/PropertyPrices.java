
package propertyprices;


public class PropertyPrices 
{

    public static void main(String[] args) 
    {
       int[][] propertyPrices = 
       {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000},
            {750000, 1300000, 1800000},
        };
       
       String[] provinces = {"Gauteng", "Natal", "Cape"};
       
       DisplayArray(propertyPrices,provinces);
       DisplayAveragePrice(propertyPrices, provinces);
    }
    
     public static void DisplayArray(int [][] prices, String [] location)
    {
        System.out.println("\t\tFLAT\t\t\tTOWN HOUSE\t\tHOUSE");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < prices.length; i++)
        {
            System.out.print(location[i] + "\t\t");
            for (int j = 0; j < prices[i].length; j++)
            {
               
                 System.out.print("R " + prices[i][j] +"\t\t");
            }
            System.out.println();
        }
    }
     
     
    public static void DisplayAveragePrice(int[][] prices, String[] location) {
       
        System.out.println("\n");
        for (int i = 0; i < prices.length; i++) {
            int sum = 0;
            for (int j = 0; j < prices[i].length; j++) {
                sum += prices[i][j];
            }
            int average = sum / prices[i].length; // integer division
            System.out.println("Average property prices in " + location[i] + " = R "+ average);
        }
    }
}

