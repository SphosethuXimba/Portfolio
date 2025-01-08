
package discountchecker;

import java.util.Scanner;
public class DiscountChecker {

    
    public static void main(String[] args)
    {
       int ageLimit=65;
       boolean ismember=false;
       
       Scanner scanner = new Scanner (System.in);
       
       System.out.println("Enter your age:");
       int age=scanner.nextInt();
       
       if (age >= ageLimit || ismember)
       {
          System.out.println("Congratulations! You are eligible for a discount"); 
       }
       else
       {
          System.out.println("Unfortunately you are not eligible for a discount");
       }
       scanner.close();
    }
    
}
