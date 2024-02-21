package Ch2Practice;

public class EcoTransportTester {
    public static void main(String[] args){
        Vehicle myVehicle = new Vehicle();
        myVehicle.setOwnerName("Daniel");
        myVehicle.setVehicleType("Ford F-150");
        myVehicle.setRegistrationNumber("123");
        System.out.println(myVehicle.toString());

        ElectricCar myElectricCar = new ElectricCar("Daniel", "Tesla", "456", 500, 300);
        System.out.println(myElectricCar);

        Bicycle myBicycle = new Bicycle("Daniel", "Bicycle", "789", true, 8);
        System.out.println(myBicycle.toString());

        ElectricScooter myElectricScooter = new ElectricScooter("Daniel", "Electric Scooter", "000", 30, 20);
        System.out.println(myElectricScooter.toString());
    }
}
