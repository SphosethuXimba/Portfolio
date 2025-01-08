
package stingbuilderexample;


public class StingBuilderExample
{

  
    public static void main(String[] args)
    {
  StringBuilder SB = new StringBuilder();
  SB.append("Hello");
  SB.append(" World");
  String FirstResult=SB.toString();
  System.out.println("First result: " + FirstResult);
  System.out.println();
  
  SB.insert(5, ",");//insert a comma on the 5th index
  System.out.println("Second result: " + SB.toString());
  System.out.println();
  
  SB.replace(6,12, " People");//replace characters from index 6 to 12 
  System.out.println("Third result: " + SB.toString());
  System.out.println();
  
  SB.delete(5,6);//delete character at index 5
  System.out.println("Fourth result: " + SB.toString());
  System.out.println();
  
  SB.reverse();//reverse the string
  System.out.println("Fifth result: " + SB.toString());
  System.out.println();
  }
}      
