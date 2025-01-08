
package weightconversion;
import javax.swing.JOptionPane;
public class WeightConversion
{
double weightInKg;
   
    public static void main(String[] args) 
    {
       String userWeightInput = JOptionPane.showInputDialog(null, "Enter weight you would like to convert in kilograms:");
       double weightInKg = Double.parseDouble(userWeightInput);
       
       double lbs = weightInKg * 2.20462262;
      JOptionPane.showMessageDialog(null, weightInKg + " Kg is equal to " + lbs + " lbs");
       
    }
    
}
