package myframe;


import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;

public class MyFrame {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("My Frame");

        //Sometimes the Frame doesnt appear as normal so you will need to 
        //clean and build your application couple times
        
        // Set the size of the frame
        frame.setSize(400, 300);

        JButton button = new JButton("Click Me");
          // Add the button to the frame
        frame.add(button);
        
          // Set the layout to null to manually set the position of the button
        frame.setLayout(null);
        
           // Set the position and size of the button
        button.setBounds(100, 100, 100, 50); // x, y, width, height
        
        // Make the frame visible
        frame.setVisible(true);
  
    }
}