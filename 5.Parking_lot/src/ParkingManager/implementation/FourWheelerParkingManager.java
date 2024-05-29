package ParkingManager.implementation;

import ParkingManager.ParkingManager;
import ParkingSpot.Implementation.FourWheelerSpot;
import ParkingSpot.Implementation.TwoWheelerSpot;
import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingManager implements ParkingManager {
    private List<FourWheelerSpot> parkingSpotList;

    public FourWheelerParkingManager() {
        this.parkingSpotList = new ArrayList<FourWheelerSpot>();
    }

    @Override
    public ParkingSpot findParking(Vehicle vehicle) {
        for(FourWheelerSpot currentSlot: parkingSpotList) {
            if(currentSlot.vehicle == null) {
                parkVehicle(vehicle, currentSlot);
                return currentSlot;
            }
        }
        System.out.println("No Parking Available");
        return null;
    }

    @Override
    public void addParking(ParkingSpot parkingSpot) {
        if (parkingSpot instanceof FourWheelerSpot) {
            parkingSpotList.add((FourWheelerSpot) parkingSpot);
        }
    }

    @Override
    public void removeParking(ParkingSpot parkingSpot) {
        if(parkingSpot instanceof TwoWheelerSpot) {
            FourWheelerSpot fourWheelerSpot = (FourWheelerSpot) parkingSpot;
            parkingSpotList.remove((fourWheelerSpot));
        }
    }


    @Override
    public void parkVehicle(Vehicle vehicle, ParkingSpot CurrentSlot) {
        if(CurrentSlot instanceof FourWheelerSpot) {
            FourWheelerSpot fourWheelerSpots = (FourWheelerSpot) CurrentSlot;
            fourWheelerSpots.parkVehicle(vehicle);
        }
    }

    @Override
    public void removeVehicle() {

    }
}
