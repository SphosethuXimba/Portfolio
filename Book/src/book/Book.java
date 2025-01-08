
package book;


public class Book 
{

private String title;
private String author;
private int price;

public String getTitle()
{        
    return title;
}
public void setTitle(String title)
{
    this.title=title;
}
public String getAuthor()
{
    return author;
}
public void setAuthor(String author)
{
    this.author=author;
}
 public int getPrice()
{
    return price;
}
public void setPrice(int price)
{
    this.price=price;
}  
    public static void main(String[] args) 
    {
     
     Book mybook = new Book();
     
     mybook.setTitle("Programming Logic & Design");
     mybook.setAuthor("Joyce Farrell");
     mybook.setPrice(500);
             
     System.out.println("****** Book Details ******");
     System.out.println("Book Title: " + mybook.getTitle());
     System.out.println("Author: " + mybook.getAuthor());
     System.out.println("Price: R" + mybook.getPrice());
    }

   
}
    

