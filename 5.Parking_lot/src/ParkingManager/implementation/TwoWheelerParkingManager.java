package ParkingManager.implementation;

import ParkingManager.ParkingManager;
import ParkingSpot.Implementation.TwoWheelerSpot;
import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

import java.util.*;

public class TwoWheelerParkingManager implements ParkingManager {
    private List<TwoWheelerSpot> parkingSpotList;

    public TwoWheelerParkingManager() {
        this.parkingSpotList = new ArrayList<TwoWheelerSpot>();
    }

    @Override
    public ParkingSpot findParking(Vehicle vehicle) {
        for(TwoWheelerSpot currentSlot: parkingSpotList) {
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
        if (parkingSpot instanceof TwoWheelerSpot) {
            parkingSpotList.add((TwoWheelerSpot) parkingSpot);
        }
    }

    @Override
    public void removeParking(ParkingSpot parkingSpot) {
        if(parkingSpot instanceof TwoWheelerSpot) {
            TwoWheelerSpot twoWheelerSpot = (TwoWheelerSpot) parkingSpot;
            parkingSpotList.remove((twoWheelerSpot));
        }
    }


    @Override
    public void parkVehicle(Vehicle vehicle, ParkingSpot CurrentSlot) {
        if(CurrentSlot instanceof TwoWheelerSpot) {
            TwoWheelerSpot twoWheelerSpot = (TwoWheelerSpot) CurrentSlot;
            twoWheelerSpot.parkVehicle(vehicle);
        }
    }

    @Override
    public void removeVehicle() {

    }
}
