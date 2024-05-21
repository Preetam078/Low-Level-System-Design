package Interface.Implementation;

import Interface.DriveModeInterface;

public class CityMode implements DriveModeInterface {
    @Override
    public void driveMode() {
        System.out.println("Car is having City Mode");
    }
}
