package Liskov_principle.Implement;

import Liskov_principle.TwoWheelers;

public class Bike implements TwoWheelers {
    private Integer velocity = 0;
    private Boolean start = false;
    @Override
    public void accelerate() {
        velocity += 10;
    }

    @Override
    public void startEngine() {
        start = true;
    }
}
