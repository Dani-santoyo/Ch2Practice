package Ch2Practice;

public class ElectricScooter extends Vehicle{
    private int maxSpeed;
    private int weightCapacity;

    public ElectricScooter(String ownerName, String vehicleType, String registrationNumber, int maxSpeed, int weightCapacity) {
        super(ownerName, vehicleType, registrationNumber);
        this.maxSpeed = maxSpeed;
        this.weightCapacity = weightCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString(){
        return "The owner of this vehicle is: " + ownerName + ". The type of vehicle is: " + vehicleType
                + ". The registration number is: " + registrationNumber + ". This electric scooter can get up " +
                "to a max speed of " + maxSpeed + " km/h and has a weight capacity of " + weightCapacity + " kg.";
    }
}
