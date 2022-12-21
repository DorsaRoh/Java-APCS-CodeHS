public class Battery
{
    private double voltage;
    public static double totalVoltage;
    public static int numOfBatteries;
    
    public Battery(double voltage)
    {
        this.voltage = voltage;
        numOfBatteries = numOfBatteries + 1;
        totalVoltage = totalVoltage + voltage;
        
        
    }
    
    public double getVoltage()
    {
        return this.voltage;
    }
}
