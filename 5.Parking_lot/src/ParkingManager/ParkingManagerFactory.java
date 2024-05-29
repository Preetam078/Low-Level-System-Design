package ParkingManager;

import ParkingManager.implementation.FourWheelerParkingManager;
import ParkingManager.implementation.TwoWheelerParkingManager;
import Vehicle.VehicleType;

public class ParkingManagerFactory {
    private ParkingManager parkingManager;
    public  ParkingManagerFactory(VehicleType vehicleType) {
        switch (vehicleType) {
            case TwoWheeler :
                this.parkingManager = new TwoWheelerParkingManager();
                break;
            case FourWheeler :
                this.parkingManager = new FourWheelerParkingManager();
                break;
        }
    }

    public ParkingManager getParkingManager() {
        return parkingManager;
    }
}
