package students;

import java.util.Scanner;

public class StudentsMainClass 
{
    // Create a single instance of Students to manage student records
    private static Students manager = new Students();

    public static void main(String[] args)
    {
        // Display the welcome message
        System.out.println("\nSTUDENT MANAGEMENT APPLICATION");
        System.out.println("***********************************************");
        loopSystem();
    }

    public static void loopSystem() 
    {
        // Initialize the scanner to take user input
        Scanner input = new Scanner(System.in);
        String choice;

        while (true) 
        {
            System.out.println("Enter (1) to launch the menu or any other key to exit");
            choice = input.nextLine();  // Read the user’s choice

            // Check if the user wants to launch the menu
            if (choice.equals("1")) 
            {
                manager.displayMenu();  // Display the menu and handle user actions
            } 
            else 
            {
                System.out.println("Exiting application. Goodbye!");
               System.exit(0); // Exit the application
            
            }
        } 
       
    }
}

/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */