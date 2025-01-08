package movieticketsalesreport;

public class MovieTicketSalesReport {

   public static void main(String[] args) {
   // Define the sales data for each movie and each agent
        int[][] ticketSales = {
            {3000, 1500, 1700},  // Sales data for movie 1
            {3500, 1200, 1600},  // Sales data for movie 2
        };
        
        // Define the names of the movies
        String[] movieNames = {"Napoleon", "Oppenheimer"};

        // Display the sales data in a table format
        displayArray(ticketSales, movieNames);

        // Calculate and display the total sales for each movie using the TotalMovieSales method
        MovieTickets.TotalMovieSales(ticketSales, movieNames);
        
        // Find the top-performing movie based on total sales
        String topMovie = MovieTickets.TopMovie(ticketSales, movieNames);
        
        // Display the top-performing movie
        System.out.println("\nTop performing movie: " + topMovie);
    }
    
    // Method to display the sales data in a tabular format
    public static void displayArray(int[][] sales, String[] names) {
        System.out.println("MOVIE TICKET SALES REPORT - 2024\n");
        System.out.println("\t\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("--------------------------------------------------------------------------------");

        // Loop through each row and display the sales for each movie
        for (int i = 0; i < sales.length; i++) {
            System.out.print(names[i] + "\t\t");  // Print the movie's name
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t\t");  // Print sales for each movie
            }
            System.out.println();  // New line for the next movie
        }
        System.out.println("\n");  // Add extra space after displaying the table
    }
}
/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */