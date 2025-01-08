
package studentgradecheck;

import java.util.Scanner;
public class StudentGradeCheck {

   
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner (System.in);//create instance for scanner
     
     System.out.println("Enter you exam score");//prompt the user
     int examScore=scanner.nextInt();
     String grade="";
     
     if (examScore>=75 && examScore<=100)
     {
       grade="UyiGhost dawg"; 
     }
     
     else if (examScore>=50 && examScore<=74)
     {
       grade="Uzamile akufani"; 
     }
     
     else if (examScore>=40 && examScore<=49)
     {
       grade="At least you didn't fail"; 
     }
     
     else if (examScore>=0 && examScore<=39)
     {
       grade="Siyeke iskole"; 
     }
     
     else
     {
        System.out.println("Invalid score. Please enter a score between 0 and 100");
     }
     scanner.close(); 
     System.out.println(grade);

    }
}
