
package mainclass;

      //Extends performs the inheritance
public class Student extends Person
{//Student is the SubClass/Child Class
    private int StudentId;
    
    public Student (String name, int studentid)
    {
        super(name);//Super is used to call the constructor of the Parent (Person)
        this.StudentId = studentid;
    }
    
    public int getStudentId()
    {
        return StudentId;
    }
    
    public void Introduce()//Method to display details
    {
        System.out.println("Hi, I am " + getName() +".");
        System.out.println("My Student numder is " + StudentId + ".");
    }//Getname() - is a method from the parent class
}
