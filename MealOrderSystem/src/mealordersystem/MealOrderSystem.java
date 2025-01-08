
package mealordersystem;

import javax.swing.JOptionPane;
public class MealOrderSystem
{


    public static void main(String[] args)
    {
     String userInputName = JOptionPane.showInputDialog(null, "Enter your name");
     JOptionPane.showMessageDialog(null, "Welcome, " + userInputName +"!");
     
     String userInputMealOrder = JOptionPane.showInputDialog(null, "Enter meal order");

     
     String Meal = JOptionPane.showInputDialog(null, "Enter your meal amount");
double MealAmount = Double.parseDouble(Meal );


    String Mealpaid = JOptionPane.showInputDialog(null, "Enter the amount you wish to pay");
double MealAmountpaid = Double.parseDouble(Mealpaid );

double change=MealAmountpaid -MealAmount;

 JOptionPane.showMessageDialog(null, "Thank you, " + userInputName +"!");
  JOptionPane.showMessageDialog(null, "Your change is " + change +"!");


    }
    
}
