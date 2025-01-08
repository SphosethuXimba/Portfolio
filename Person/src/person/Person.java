
package person;

public class Person//Working with getters and setters 
{//Setup your private fields/attributes
private String name;
private int age;

public String getName()//Getter method for name field
{        
    return name;
}
public void setName(String name)//Setter method for the name field
{
    this.name=name;
}
public int getAge()//Getter method for age field
{
    return age;
}
public void setAge(int age)//Setter method for the age field
{
    this.age=age;
}
    public static void main(String[] args)
    {
      //Think about where you want to place your main method
     Person myperson = new Person();
     
     myperson.setName("Brock Lesnar");
     myperson.setAge(46);
     
     System.out.println("****** Person Details ******");
     System.out.println("Full Name: " + myperson.getName());
     System.out.println("Age: " + myperson.getAge());
    }
    
}
