package Ch2Practice;

public class Vehicle {
    protected String ownerName;
    protected String vehicleType;
    protected String registrationNumber;

    public Vehicle(){
        this.ownerName = "Jane Doe";
        this.vehicleType = "Car";
        this.registrationNumber = "0000";
    }

    public Vehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerName(){
        return this.ownerName;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }
    public String getRegistrationNumber(){
        return this.registrationNumber;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString(){
        return "The owner of this vehicle is: " + ownerName + ". The type of vehicle is: " + vehicleType
                + ". The registration number is: " + registrationNumber + ".";
    }
}
