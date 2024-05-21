package Interface.Implementation;

import Interface.DriveModeInterface;

public class EcoMode implements DriveModeInterface {
    @Override
    public void driveMode() {
        System.out.println("Car is having Eco Mode");
    }
}
