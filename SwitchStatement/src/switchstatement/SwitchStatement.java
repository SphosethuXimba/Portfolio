
package switchstatement;
import java.util.Scanner;
public class SwitchStatement {

  
    public static void main(String[] args) 
    {
       Scanner scanner= new Scanner(System.in);
       //Prompt the for day of the week
       System.out.println("Enter the day of the week(1-7)");
       int day=scanner.nextInt();
       String DayOfWeek;
       switch (day){
           case 1:
               DayOfWeek="Monday";
           break;
           case 2:
               DayOfWeek="Tuesday";
           break;
           case 3:
               DayOfWeek="Wednesday";
               System.out.println("It's Wacky Wednesday");
           break;
           case 4:
               DayOfWeek="Thursday";
           break;
           case 5:
               DayOfWeek="Friday";
               System.out.println("It's Freaky Friday");
           break;
           case 6:
               DayOfWeek="Saturday";
           break;
           case 7:
               DayOfWeek="Sunday";
           break;
           default:
               DayOfWeek="Invalid input";
       }
       
        System.out.println("Day of the Week: " + DayOfWeek);
        scanner.close();
    }
    
}
