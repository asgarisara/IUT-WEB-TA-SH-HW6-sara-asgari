public class Car extends Vehicle
{
    Car(String c,String m,int s)
    {
        super(c,m,s);
    }
    public Integer getNumberOfSeats()
    {
        return 5;
    }
    public Integer getNumberOfWheels()
    {
        return 4;
    }
    public String getVehicleType()
    {
        return "Car";
    }
    public Integer getNumberOfDoors()
    {
        return 4;
    }
}