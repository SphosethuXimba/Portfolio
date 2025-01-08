
package homemakeover;

public class HomeMakeover
{

    public static void main(String[] args)
    {
        int [][] TwoDimensionalArray = 
     { 
           {8, 2, 5},
           {7, 4, 5},
           {5, 5, 2},
           {2, 2, 3},
           {7, 7, 9},
           {7, 8, 5},
     };
        
         String [] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
         
          DisplayArray(TwoDimensionalArray,months);
          CalculateTotal(TwoDimensionalArray,months);
    }
 
    
     public static void DisplayArray(int [][] jobs, String [] names)
    {
        System.out.println("**************************************************************");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("**************************************************************");
        System.out.println("\tBathrooms\tKitchens\tGarden");
        
        for (int i = 0; i < jobs.length; i++)
        {
            System.out.print(names[i] + "\t");
            for (int j = 0; j < jobs[i].length; j++)
            {
               
                 System.out.print(jobs[i][j] +"\t\t");
            }
            System.out.println();
        }
    }
     
      public static void CalculateTotal(int [][] jobs, String [] names)
       {
        System.out.println("**************************************************************");
        System.out.println("MONTHLY TOTALS");
        System.out.println("**************************************************************");
        
         for (int i = 0; i < jobs.length; i++) 
    {
        int total = 0;
        for (int j = 0; j < jobs[i].length; j++) 
        {
            total += jobs[i][j]; // Sum up sales for each vehicle across all months
        }
        if (total>=15)
        {
              System.out.println(names[i] +"\t"+ total +"\t***");
        }
        else
        {
             System.out.println(names[i] +"\t"+ total);
        }
      
    }
       }
}
