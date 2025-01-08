
package numbersdialog;

import javax.swing.JOptionPane;

public class NumbersDialog 
{

    
    public static void main(String[] args)
    {
        int creditDays = 30;
        JOptionPane.showMessageDialog(null, "" + creditDays);
        JOptionPane.showMessageDialog
               (null, "Every bill is due in " + creditDays + " days");
   
        System.out.println("Hello\nWorld");
        
        System.out.println("Hello\tWorld");
        
        System.out.println("Hello\bWorld");
         
        System.out.println("Hello\rWorld");
     
        
        
        
        String userInputName = JOptionPane.showInputDialog(null, "Enter your name");
        JOptionPane.showMessageDialog(null, "Hello, " + userInputName +"!");
    }
   
}
