
package deliveryreport;

public class DeliveryReport
{

    public static void main(String[] args)
    {
      int [][] deliveries = 
     { 
           {128, 135, 139},
           {155, 129, 175},
           {129, 130, 185},
     };
      
      String [] years = {"DELIVERIES 2018", "DELIVERIES 2019", "DELIVERIES 2020"};
      
       DisplayArray(deliveries,years);
       CalculateTotal(deliveries);
       FindMaximum(deliveries);
       FindMinimum(deliveries);
    }
    
     public static void DisplayArray(int [][] deliveries, String [] year)
    {
        System.out.println("**************************************************************");
        System.out.println("DELIVERIES REPORT");
        System.out.println("**************************************************************");
        System.out.println("\t\t\tJAN\t\tFEB\t\tMAR");
        
        for (int i = 0; i < deliveries.length; i++)
        {
            System.out.print(year[i] + "\t\t");
            for (int j = 0; j < deliveries[i].length; j++)
            {
               
                 System.out.print(deliveries[i][j] +"\t\t");
            }
            System.out.println();
        }
    }
     
      public static void CalculateTotal(int [][] deliveries)
       {
        System.out.println("**************************************************************");
        System.out.println("DELIVERIES STATISTICS");
        System.out.println("**************************************************************");
         /*
    Title: Java: find sum of 2d array of numbers
    Author: Connor J
    Date: 22 April 2018
    Code Version: 1 
    Availability: https://stackoverflow.com/questions/49967001/java-find-sum-of-2d-array-of-numbers
    */
         int sum = 0;
         for (int row=0; row < deliveries.length; ++row)
         {
             for(int col=0; col < deliveries[row].length; ++col)
             {
                 sum = sum + deliveries[row][col];
             }
         }
           System.out.println("Total Deliveries:\t" + sum);
       }
      
       /*
    Title: Finding minimum and maximum in Java 2D array
    Author: Pavel S
    Date: 9 July 2016
    Code Version: 1 
    Availability: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
    */
      public static void FindMaximum(int [][] deliveries)
      {
          int maxValue = deliveries[0][0];
        for (int j = 0; j < deliveries.length; j++) 
        {
            for (int i = 0; i < deliveries[j].length; i++) 
            {
                if (deliveries[j][i] > maxValue) 
                {
                    maxValue = deliveries[j][i];
                }
            }
        }
          System.out.println("Maximum Deliveries:\t" + maxValue);
      }
      
      public static void FindMinimum(int [][] deliveries)
      {
          int minValue = deliveries[0][0];
        for (int j = 0; j < deliveries.length; j++) 
        {
            for (int i = 0; i < deliveries[j].length; i++) 
            {
                if (deliveries[j][i] < minValue )
                {
                    minValue = deliveries[j][i];
                }
            }
        }
         System.out.println("Minimum Deliveries:\t" + minValue);
         System.out.println("**************************************************************");
      }
      
}
