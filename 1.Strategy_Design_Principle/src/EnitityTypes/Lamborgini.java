package EnitityTypes;

import Entity.Vehicle;
import Interface.Implementation.SportsMode;

public class Lamborgini extends Vehicle {
    public Lamborgini() {
        super(new SportsMode());
    }
}
