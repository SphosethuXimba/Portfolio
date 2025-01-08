
package movie_tickets;


// Abstract class Tickets
public abstract class Tickets implements iTickets {
    protected String customerName;
    protected String movieTitle;
    protected int customerAge;
    protected double price;

    // Constructor
    public Tickets(String customerName, String movieTitle, int customerAge, double price) {
        this.customerName = customerName;
        this.movieTitle = movieTitle;
        this.customerAge = customerAge;
        this.price = price;
    }

    // Get methods
    public String getCustomerName() {
        return customerName;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public double getPrice() {
        return price;
    }
}
