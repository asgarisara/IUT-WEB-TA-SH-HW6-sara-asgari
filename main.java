public class main {
    public static void main(String args[])
    {
        Vehicle myCar = new Car("red","pride141",100);
        System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfSeats() + " seats.");
        System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfWheels() + " wheels.");
        System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getspeed() + " speed.");
        myCar.Accelare(20);
        System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getspeed() + " speed.");

        Vehicle myBus = new Bus("yellow","scania900",80);
        System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getNumberOfSeats() + " seats.");
        System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getNumberOfWheels() + " wheels.");
        System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getspeed() + " speed.");
        myBus.Brake(20);
        System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getspeed() + " speed.");

    }
}
