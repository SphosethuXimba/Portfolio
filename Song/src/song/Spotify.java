
package song;

public class Spotify 
{
   public static void main(String[] args) {
       //Create instances using diffirent constructors
       Song fullSong = new Song("WILSHIRE", "Tyler, The Creator", 8.36);
       
       //Display information for each song
       fullSong.displayInfo();
   }    
}
