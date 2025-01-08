
package movie_tickets;


// Subclass TicketSales extending Tickets
public class TicketSales extends Tickets 
{
public TicketSales(String customerName, String movieTitle, int customerAge, double price) {
super(customerName, movieTitle, customerAge, price);
}

    // Implementing the print_tickets method
    @Override
    public void print_tickets() {
        double discount = 0;
        if (customerAge >= 65) {
            discount = price * 0.10; // 10% discount
        }
        double finalCost = price - discount;
        
        System.out.println("Customer Name: " + customerName);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Movie Price: R " + price);
        System.out.println("Discount: R " + discount);
        System.out.println("Final Cost: R " + finalCost);
    }
}
