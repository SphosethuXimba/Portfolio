
package mainclass;


public class MainClass 
{

  
    public static void main(String[] args) 
    {
       //Create your instances of the classes
        
        Person person1 = new Person ("Brock");
        
        Student stud1 = new Student ("Alan", 1004225);
        
        System.out.println("\n**********Person Details**********");
        System.out.println("Person: "+ person1.getName());
        
        System.out.println("\n**********Student Details**********");
        System.out.println("Student: "+ stud1.getName() +  " StudentID: " + stud1.getStudentId());
        
         System.out.println("\n**********Student Details Addtional Method**********");
        stud1.Introduce();
    }
    
}
