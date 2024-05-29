package ParkingManager;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

public interface ParkingManager {


    public ParkingSpot findParking(Vehicle vehicle);
    public void addParking(ParkingSpot parkingSpot);
    public void removeParking(ParkingSpot parkingSpot);
    public void parkVehicle(Vehicle vehicle, ParkingSpot slot);
    public void removeVehicle();
}
