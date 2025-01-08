
package birthyearexample;

import javax.swing.JOptionPane;//packages installed
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;

public class BirthYearExample 
{
public static void main(String[] args)
{
 //Ask the user for their birth year
String inputYear = JOptionPane.showInputDialog("Enter your year of birth");

//Convert the input to an integer
int birthYear = Integer.parseInt(inputYear);

//Calculate the current age
int currentYear = 2024;



int age = currentYear - birthYear;

//Display the result to the user
JOptionPane.showMessageDialog(null, "Your age is: " + age);
   
}
    
}

