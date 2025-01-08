

import javax.swing.JOptionPane;
public class GUI_input 
{
   public static void main(String[] args) 
{
String userInputString = JOptionPane.showInputDialog(null, "Enter your name:");
JOptionPane.showMessageDialog(null, "Hello, " + userInputString + "!");


String ageInput = JOptionPane.showInputDialog(null, "Enter your age:");
int age = Integer.parseInt(ageInput);
int futureAge = age + 5;
JOptionPane.showMessageDialog(null, "In 5 years, you will be " + futureAge + " years old!");
}    
}
