
package song;
public class Song {
//Instance variables
    public String title;
    public String artist;
    public double duration;
    
    //Default constructor
    public Song() {
  //Default values or setup logic can be added here
        this.title = "Unknown";
        this.artist = "Unknown";
        this.duration = 0.0;//Duration in minutes
    }
    //Constructor with title
    public Song(String title) {
  //Default values or setup logic can be added here
        this.title = "WILSHIRE";
        this.artist = "Unknown";
        this.duration = 0.0;   
    }
    //Constructor with title and artist
    public Song(String title,String artist) {
  //Default values or setup logic can be added here
        this.title = "WILSHIRE";
        this.artist = "Tyler, The Creator";
        this.duration = 0.0; 
    }
     //Full constructors with all properties
    public Song(String title ,String artist, double duration) {
  //Default values or setup logic can be added here
        this.title = "SORRY NOT SORRY";
        this.artist = "Tyler, The Creator";
        this.duration = 3.26; 
    }
    
    //Method to display song information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Artist: " + duration + " minutes");
        System.out.println("I'm sorry I don't see you more");
    }
}