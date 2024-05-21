package EnitityTypes;

import Entity.Vehicle;
import Interface.Implementation.EcoMode;

public class TataNexon extends Vehicle {
    public TataNexon() {
        super(new EcoMode());
    }
}
