package Ch2Practice;

public class Bicycle extends Vehicle {
    private boolean hasGears;
    private int gearCount;

    public Bicycle(String ownerName, String vehicleType, String registrationNumber, boolean hasGears, int gearCount) {
        super(ownerName, vehicleType, registrationNumber);
        this.hasGears = hasGears;
        this.gearCount = gearCount;
    }

    public boolean hasGears() {
        return hasGears;
    }

    public void setHasGears(boolean hasGears) {
        this.hasGears = hasGears;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    @Override
    public String toString(){
        if(hasGears){
            return "The owner of this vehicle is: " + ownerName + ". The type of vehicle is: " + vehicleType
                    + ". The registration number is: " + registrationNumber + ". This bike has "  + gearCount +
                    " gears.";
        }else{
            return "The owner of this vehicle is: " + ownerName + ". The type of vehicle is: " + vehicleType
                    + ". The registration number is: " + registrationNumber + ". This bike does not have gears";
        }
    }
}
