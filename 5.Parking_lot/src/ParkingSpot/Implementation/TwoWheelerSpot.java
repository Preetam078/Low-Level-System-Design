package ParkingSpot.Implementation;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

public class TwoWheelerSpot implements ParkingSpot {
    public int id;
    public boolean isEmpty;
    public Vehicle vehicle;
    public int price;

    public TwoWheelerSpot(int id) {
        this.id = id;
        this.isEmpty = false;
        this.vehicle = null;
        this.price = 10;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = true;
    }

    @Override
    public void removeVehicle() {
        this.isEmpty = false;
        this.vehicle = null;
    }
}