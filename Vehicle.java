public abstract class Vehicle {
    String color;
    String model;
    int speed;
    public abstract Integer getNumberOfSeats();
    public abstract Integer getNumberOfWheels();
    public abstract String getVehicleType();
    public abstract Integer getNumberOfDoors();
    Vehicle(String c,String m,int s)
    {
        color=c;
        model=m;
        speed=s;
    }
    public void Accelare(int a)
    {
        speed+=a;
    }
    public void Brake(int a)
    {
        speed-=a;
    }
    public Integer getspeed()
    {
        return speed;
    }
    public String getmodel()
    {
        return model;
    }
    public String getColor()
    {
        return color;
    }
}
