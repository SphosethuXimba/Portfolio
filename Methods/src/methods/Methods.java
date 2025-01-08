
package methods;


public class Methods
{
//Creating a method without parameters
    public static void greetings()
    {
    System.out.println("Hello");
    }
    //Creating a method with parameters
    public static void Addition(int num1, int num2)
    {
    int sum= num1 + num2;
    System.out.println("Sum: " + sum);
    }
    public static void main(String[] args)//This is your main method
    {
    //call your method 
    greetings();
    
    Addition(5,10);
    }
    
}
 