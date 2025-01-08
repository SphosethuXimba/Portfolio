
package stringbuilderactivity;


public class StringBuilderActivity 
{


    public static void main(String[] args)
    {
        StringBuilder SX = new StringBuilder();
          SX.append("Sphosethu");
          SX.append(" Ximba");
          System.out.println("First result: " + SX.toString());
          System.out.println();
          
          SX.insert(5, ".");//insert a full stop on the 5th index
          System.out.println("Second result: " + SX.toString());
          System.out.println();
          
          SX.replace(10,15, " needs help");//replace characters from index 10 to 15
          System.out.println("Third result: " + SX.toString());
          System.out.println();
          
          SX.delete(5,6);//delete character at index 5
          System.out.println("Fourth result: " + SX.toString());
          System.out.println();
          
          SX.reverse();//reverse the string
          System.out.println("Fifth result: " + SX.toString());
          System.out.println();
    }
    
}
