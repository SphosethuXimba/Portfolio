
package studentscores;
import java.util.Scanner;
public class StudentScores 
{

   
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in); 
        int maxStudents = 3;
        
        String[][] studentScores = new String[3][3];
        
        studentScores[0][0] = "Math";
        studentScores[0][1] = "English";
        studentScores[0][2] = "Science";
        
        System.out.println("Enter the name of the student");
        for (int i = 0; i < maxStudents; i++)
        {
            for (int j = 0; j < maxStudents; j++)
            {
                System.out.println("Enter the student's test score");
                studentScores[i][j] = scanner.nextLine();
            }
        }
        
        System.out.println("The entered array is:");
        for (int i = 0; i < maxStudents; i++) {
            for (int j = 0; j < maxStudents; j++) {
                System.out.print(studentScores[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
        
        
}
}