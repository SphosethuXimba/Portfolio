
package speedingfineapplication;


// Abstract class Fine
public abstract class Fine implements iFine
{
    protected String personName;
    protected int personSpeed;
    protected double fine;
   
    
     // Constructor
    public Fine(String personName, int personSpeed, double fine) 
    {
        this.personName = personName;
        this.personSpeed = personSpeed;
        this.fine = fine;
    }

     // Get methods
    public String getPersonName()
    {
        return personName;
    }

     public int getPersonSpeed()
    {
        return personSpeed;
    }
     
      public double getFine() 
    {
        return fine;
    }
}
