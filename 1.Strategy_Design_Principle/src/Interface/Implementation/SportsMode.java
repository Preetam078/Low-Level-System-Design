package Interface.Implementation;

import Interface.DriveModeInterface;

public class SportsMode implements DriveModeInterface {
    @Override
    public void driveMode() {
        System.out.println("Car is Having Sport mode");
    }
}
