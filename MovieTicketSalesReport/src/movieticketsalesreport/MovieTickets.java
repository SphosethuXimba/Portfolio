
package movieticketsalesreport;


    public abstract class MovieTickets implements IMovieTickets
{
  // Method to calculate and display the total sales for each movie
    public static void TotalMovieSales(int[][] sales, String[] names) {
        // Loop through each agent (rows in the sales array)
        for (int i = 0; i < sales.length; i++) {
            int sum = 0;  // Variable to store the total sales

            // Loop through each month (columns in the sales array) to calculate the sum
            for (int j = 0; j < sales[i].length; j++) {
                sum += sales[i][j];  // Add sales for each month
            }
            
            // Print the total sales
            System.out.println("Total movie ticket sales for " + names[i] + ": " + sum);
        }
        System.out.println("\n");  // Add extra space after displaying the total sales
    }

    // Method to find the top movie based on total sales across all movies
    public static String TopMovie(int[][] sales, String[] movieNames) {
        int maxSales = 0;  // Variable to store the highest total sales
        String topMovie = "";  // Variable to store the name of the movie with the highest sales

        // Loop through each movie (columns in the sales array)
        for (int j = 0; j < sales[0].length; j++) {
            int movieSales = 0;  // Variable to sum the sales for the current movie

            // Loop through each movie (rows in the sales array) to sum the sales for the current movie
            for (int i = 0; i < sales.length; i++) {
                movieSales += sales[i][j];  // Add sales for the current movie
            }

            // If the current movie's total sales are higher than the previous maximum, update the top movie
            if (movieSales > maxSales) {
                maxSales = movieSales;  // Update the maximum sales
                topMovie = movieNames[j];  // Update the name of the movie with the highest sales
            }
        }

        return topMovie;  // Return the name of the top-performing movie
    }
    }
/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */