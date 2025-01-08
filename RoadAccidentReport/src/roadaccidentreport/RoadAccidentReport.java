package roadaccidentreport;
import java.util.Scanner;

public class RoadAccidentReport {

   
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Define the number of cities and types of accidents
        int rows = 3; // Three cities
        int cols = 2; // Two types of accidents: car and motorbike

        // Initialize the accidents array
        int[][] accidents = new int[rows][cols];

        // Array of city names
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // User input for the number of accidents
        for (int i = 0; i < cities.length; i++) 
        {
            System.out.print("Enter the number of car accidents for " + cities[i] + ": ");
            accidents[i][0] = scanner.nextInt(); // Column 0 for car accidents

            System.out.print("Enter the number of motor bike accidents for " + cities[i] + ": ");
            accidents[i][1] = scanner.nextInt(); // Column 1 for motorbike accidents
        }
        
         // Display the accident report
        DisplayArray(accidents, cities);
        // Calculate and display the total accidents for each city
        CalculateTotal(accidents, cities);
        // Find and display the city with the maximum accidents
        FindMaximum(accidents, cities);
    }
   // Method to display the accident report
    public static void DisplayArray(int[][] collision, String[] location) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\tCAR\t\tMOTOR BIKE");

        // Loop through each city and print the accident data
        for (int i = 0; i < collision.length; i++) {
            System.out.print(location[i] + "\t\t");
            for (int j = 0; j < collision[i].length; j++) {
                // Only print the accident counts if they are greater than zero
                if (collision[i][j] > 0) {
                    System.out.print(collision[i][j] + "\t\t");
                } else {
                    System.out.print("\t\t"); // Print empty space for zero
                }
            }
            System.out.println(); // Move to the next line after each city's data
        }
    }
    
    // Method to calculate and display the total accidents for each city
    public static void CalculateTotal(int[][] collision, String[] location) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------------");
/*
    Title: Java: find sum of 2d array of numbers
    Author: Connor J
    Date: 22 April 2018
    Code Version: 1 
    Availability: https://stackoverflow.com/questions/49967001/java-find-sum-of-2d-array-of-numbers
    */
        // Iterate through each city and calculate the total accidents
        for (int row = 0; row < collision.length; row++) {
            int sum = 0; // Reset sum for each city
            for (int col = 0; col < collision[row].length; col++) {
                sum += collision[row][col]; // Sum the accidents for the city
            }
            // Display the total for the city
            System.out.println(location[row] + "\t\t" + sum);
        }
    }

   /*
    Title: Finding minimum and maximum in Java 2D array
    Author: Pavel S
    Date: 9 July 2016
    Code Version: 1 
    Availability: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
    */
     // Method to find and display the city with the maximum number of accidents
    public static void FindMaximum(int[][] collision, String[] location) {
        int maxValue = 0; // Start with 0 since we are looking for maximum
        int cityIndex = -1; // To keep track of the city with the maximum accidents

        // Iterate through each city to calculate total accidents
        for (int j = 0; j < collision.length; j++) {
            int sum = 0; // Reset sum for each city
            for (int i = 0; i < collision[j].length; i++) {
                sum += collision[j][i]; // Sum the accidents for the city
            }

            // Check if the current city has more accidents than the current maxValue
            if (sum > maxValue) {
                maxValue = sum; // Update maxValue
                cityIndex = j; // Update the index of the city with the maximum accidents
            }
        }

        // Display the city with the maximum accidents
        if (cityIndex != -1) {
            System.out.println("");
            System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + location[cityIndex]);
            System.out.println("---------------------------------------------------------------");
        }
    }
      
}
