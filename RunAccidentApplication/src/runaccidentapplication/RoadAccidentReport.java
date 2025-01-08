
package runaccidentapplication;


public class RoadAccidentReport extends RoadAccidents
{
    public RoadAccidentReport(String AccidentVehicleType, String City, int AccidentTotal) {
super(AccidentVehicleType, City, AccidentTotal);
}
   
    public void printAccidentReport() 
    {
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("**************************************");
        System.out.println("VEHICLE TYPE: " + AccidentVehicleType);
        System.out.println("CITY: " + City);
        System.out.println("ACCIDENT TOTAL: " + AccidentTotal);
    }
}

