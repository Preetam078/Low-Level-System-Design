package Liskov_principle;

import Liskov_principle.Implement.Bike;
import Liskov_principle.Implement.Cycle;

/*
* Liskov Principle ==> 2 child class with different properties may use same Parent but still the program must not break
* */

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.startEngine();

        Cycle cycle = new Cycle();
        cycle.startEngine();
    }
}
