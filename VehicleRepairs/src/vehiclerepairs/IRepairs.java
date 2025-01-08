
package vehiclerepairs;


public interface IRepairs 
{
    double RepairCosts(double[] repairCosts);
    double TechnicianPay(double amount);
    int TopTechnician(double[] repairs);
}
