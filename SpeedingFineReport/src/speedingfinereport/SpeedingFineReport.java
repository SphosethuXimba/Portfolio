
package speedingfinereport;

public class SpeedingFineReport
{

   
    public static void main(String[] args) 
    {
      int [][] speedingFines = 
     { 
           {128, 135, 139},
           {155, 129, 175},
           {129, 130, 185},
           {195, 155, 221},
     };
      
       String [] cities = {"JHB", "DBN", "CTN", "PE"};
       
        DisplayArray(speedingFines,cities);
        FindMaximum(speedingFines);
        FindMinimum(speedingFines);
    }
    
     public static void DisplayArray(int [][] fines, String [] location)
    {
        System.out.println("**************************************************************");
        System.out.println("SPEEDING FINE REPORT");
        System.out.println("**************************************************************");
        System.out.println("\t\tJAN\t\tFEB\t\tMAR");
        
        for (int i = 0; i < fines.length; i++)
        {
            System.out.print(location[i] + "\t\t");
            for (int j = 0; j < fines[i].length; j++)
            {
               
                 System.out.print(fines[i][j] +"km\t\t");
            }
            System.out.println();
        }
    }
     
       /*
    Title: Finding minimum and maximum in Java 2D array
    Author: Pavel S
    Date: 9 July 2016
    Code Version: 1 
    Availability: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
    */
      public static void FindMaximum(int [][] fines)
      {
          System.out.println("**************************************************************");
          int maxValue = fines[0][0];
        for (int j = 0; j < fines.length; j++) 
        {
            for (int i = 0; i < fines[j].length; i++) 
            {
                if (fines[j][i] > maxValue) 
                {
                    maxValue = fines[j][i];
                }
            }
        }
          System.out.println("Maximum speed captured: " + maxValue + "km");
      }
      
       public static void FindMinimum(int [][] fines)
      {
          int minValue = fines[0][0];
        for (int j = 0; j < fines.length; j++) 
        {
            for (int i = 0; i < fines[j].length; i++) 
            {
                if (fines[j][i] < minValue )
                {
                    minValue = fines[j][i];
                }
            }
        }
         System.out.println("Minimum speed captured: " + minValue + "km");
         System.out.println("**************************************************************");
      }
      
     
}
