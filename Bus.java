public class Bus extends Vehicle
{
    Bus(String c,String m,int s)
    {
        super(c,m,s);
    }
    public Integer getNumberOfSeats()
    {
        return 35;
    }
    public Integer getNumberOfWheels()
    {
        return 6;
    }
    public String getVehicleType()
    {
        return "Bus";
    }
    public Integer getNumberOfDoors()
    {
        return 4;
    }
}