package Liskov_principle.Implement;

import Liskov_principle.TwoWheelers;

public class Cycle implements TwoWheelers {
    private Boolean start = false;
    private Integer velocity = 0;
    @Override
    public void startEngine() {
        System.out.println(new AssertionError("There is no Engine"));
    }

    @Override
    public void accelerate() {
        velocity += 1;
    }
}
