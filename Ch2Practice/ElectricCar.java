package Ch2Practice;

public class ElectricCar extends Vehicle{
    private int batteryCapacity;
    private int range;

    public ElectricCar(){
        super();
        this.batteryCapacity = 0;
        this.range = 0;
    }

    public ElectricCar(String ownerName, String vehicleType, String registrationNumber, int batteryCapacity, int range){
        super(ownerName, vehicleType, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    @Override
    public String toString(){
        return "The owner of this vehicle is: " + ownerName + ". The type of vehicle is: " + vehicleType
                + ". The registration number is: " + registrationNumber + ". This electric car has a battery capacity of "
                + batteryCapacity + "kWh, and a range of " + range + " kilometers.";
    }
}
