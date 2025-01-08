package fitnessplan;

import java.util.Scanner;

/**
 * Main class for the Fitness Plan application. It prompts the user to enter their fitness goal
 * and generates a personalized fitness plan based on the user's input.
 */
public class FitnessPlanMainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FitnessPlan plan = new FitnessPlan();
        int goal = 0;
        
        // Greet the user and prompt for their name
        System.out.println("Welcome to the Fitness Plan Creator!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! What is your fitness goal?");
        
        // Prompt user to enter their fitness goal
        while (true) 
        {
            // Ask the user for their fitness goal
            System.out.println("1. Lose Weight");
            System.out.println("2. Gain Muscle");
            System.out.println("3. Gain Weight");
            System.out.print("Enter the number corresponding to your goal: ");
      

            // Read user input
            try 
            {
                goal = Integer.parseInt(scanner.nextLine());

                // Check if the input is valid
                if (goal >= 1 && goal <= 3) 
                {
                    break; // Exit the loop if input is valid
                } 
                else 
                {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            } 
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
            }
        }

        // Generate and display the fitness plan based on user input
        plan.generatePlan(goal);
        plan.displayPlan();
    }
}


/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */