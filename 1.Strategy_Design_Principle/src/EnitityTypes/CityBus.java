package EnitityTypes;

import Entity.Vehicle;
import Interface.Implementation.CityMode;

public class CityBus extends Vehicle {
    public CityBus() {
        super(new CityMode());
    }
}
