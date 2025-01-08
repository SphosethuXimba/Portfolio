package codys_car_care_shop;

import javax.swing.JOptionPane;

public class Codys_Car_Care_Shop {

    public static void main(String[] args) {
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        
        JOptionPane.showMessageDialog(null, "Welcome to Cody's Car Care Shop");
        String serviceRequired = JOptionPane.showInputDialog(null, "Please pick the service you require (Pick a number between 1 and 4)\n1: Oil Change\n2: Tire Rotation\n3: Battery Check\n4: Brake Inspection");
        int serviceCar = Integer.parseInt(serviceRequired); 
        
        // Check if the input is within the valid range
        if (serviceCar >= 1 && serviceCar <= 4) {
            // Convert the 1-based index to a 0-based index
            int index = serviceCar - 1;
            JOptionPane.showMessageDialog(null, "The cost of the " + services[index] + " will be R" + prices[index]);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid service number. Please pick a number between 1 and 4.");
        }
    }
}
