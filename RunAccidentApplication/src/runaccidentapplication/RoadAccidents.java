
package runaccidentapplication;

public abstract class RoadAccidents implements IRoadAccidents
{
    protected String AccidentVehicleType;
    protected String City;
    protected int AccidentTotal;
    
    
    // Constructor
    public RoadAccidents(String AccidentVehicleType, String City, int AccidentTotal) 
    {
        this.AccidentVehicleType = AccidentVehicleType;
        this.City = City;
        this.AccidentTotal = AccidentTotal;
    }
    
     // Get methods
    public String getAccidentVehicleType() {
        return AccidentVehicleType;
    }

    public String getCity() {
        return City;
    }

    public int getAccidentTotal() {
        return AccidentTotal;
    }
}
