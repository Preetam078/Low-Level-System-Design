package Entity;

import Interface.DriveModeInterface;

public class Vehicle {
    DriveModeInterface driveModeInterface;
    public Vehicle(DriveModeInterface driveModeInterface) {
        this.driveModeInterface = driveModeInterface;
    }
    public void getDriveMode() {
        driveModeInterface.driveMode();
    }
}
