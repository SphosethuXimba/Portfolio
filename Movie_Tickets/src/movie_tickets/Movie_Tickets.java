
package movie_tickets;

import java.util.Scanner;
public class Movie_Tickets {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter the movie: ");
        String movieTitle = scanner.nextLine();

        System.out.print("Enter the customer age: ");
        int customerAge = scanner.nextInt();
        
        System.out.print("Enter the movie cost: ");
        double movieCost = scanner.nextDouble();

     // Create an instance of TicketSales and test the output
      //TicketSales ticket = new TicketSales("Joe Bloggs", "Avengers End Game", 67, 50.0);
    
        TicketSales ticket = new TicketSales(customerName, movieTitle, customerAge, movieCost);

        ticket.print_tickets();
        
        scanner.close();
    }
    
}
