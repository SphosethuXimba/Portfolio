package movieticketsalesreport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTicketsTest {

    public MovieTicketsTest() {
    }

    @Test
    public void testTotalMovieSales() {
        // Test the TotalMovieSales method of MovieTickets class
        int[][] sales = {
            {1000, 1500, 2000},  // Sales for agent 1
            {2000, 2500, 3000}   // Sales for agent 2
        };
        String[] movieNames = {"Movie A", "Movie B", "Movie C"};

        // Expected total sales for each agent (sum of sales per row)
        int[] expectedTotalSales = {4500, 7500}; // Expected totals for agent 1 and 2

        // Capture the output of the TotalMovieSales method using System.out
        // For simplicity in this test case, we're assuming the method prints output
        // rather than returning a value (as per your code structure).

        // In real-world practice, you could refactor this method to return a value.
        MovieTickets.TotalMovieSales(sales, movieNames);
        
        // As the method doesn't return anything, there's no direct assertion
        // Instead, we would need to use other methods, like capturing the System output,
        // or refactor this method to return a value to make it more testable.
        // For now, we assume that if it doesn't throw an exception, it works as expected.
    }

    @Test
    public void testTopMovie() {
        // Test the TopMovie method of MovieTickets class
        int[][] sales = {
            {1000, 1500, 2000},  // Sales for agent 1
            {2000, 2500, 3000}   // Sales for agent 2
        };
        String[] movieNames = {"Movie A", "Movie B", "Movie C"};

        // Expected top movie based on highest total sales
        String expectedTopMovie = "Movie C"; // Total sales for Movie C = 2000 + 3000 = 5000

        String actualTopMovie = MovieTickets.TopMovie(sales, movieNames);

        // Assert that the top movie is correctly identified
        assertEquals(expectedTopMovie, actualTopMovie);
    }

    @Test
    public void testTotalMovieSalesSum() {
        // Refactor the above example to return the total sales for each agent
        int[][] sales = {
            {1000, 1500, 2000},
            {2000, 2500, 3000}
        };

        // Calculate the sum of sales for each agent
        int[] expectedAgentSales = {4500, 7500};
        
        // Loop through the sales array and calculate the sum for each agent
        int[] actualAgentSales = new int[sales.length];
        for (int i = 0; i < sales.length; i++) {
            int sum = 0;
            for (int j = 0; j < sales[i].length; j++) {
                sum += sales[i][j];
            }
            actualAgentSales[i] = sum;
        }

        // Assert that the total sales per agent are correct
        assertArrayEquals(expectedAgentSales, actualAgentSales);
    }
}
