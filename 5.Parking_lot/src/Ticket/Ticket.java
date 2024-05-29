package Ticket;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

public class Ticket {
    private int time;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public Ticket(int time, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.time = time;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public int getTime() {
        return time;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
