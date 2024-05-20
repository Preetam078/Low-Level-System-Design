package Dependency_inversion_principle;

import Dependency_inversion_principle.Implement.WiredMouse;
import Dependency_inversion_principle.Implement.WirelessMouse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        WirelessMouse mouse1 = new WirelessMouse();
        mouse1.getMouse("Wireless Mouse");

        WiredMouse mouse2 = new WiredMouse();
        mouse2.getMouse("Wired Mouse");
    }
}
