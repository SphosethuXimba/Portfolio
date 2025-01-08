package workouttracker;

import java.util.Scanner;

public class WorkoutApplication {

    // Main method where the application starts execution.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for workout details.
        System.out.println("Enter your workout details:");

        System.out.print("Exercises: ");
        String exercises = scanner.nextLine();

        System.out.print("Duration (in minutes): ");
        int duration = scanner.nextInt();

        System.out.print("Intensity Level (1-10): ");
        int intensityLevel = scanner.nextInt();

        // Create an instance of ProcessWorkout with the provided details.
        ProcessWorkout workout = new ProcessWorkout(exercises, duration, intensityLevel);

        // Call the printWorkout method to display the workout details.
        workout.printWorkout();

        scanner.close();
    }
}
