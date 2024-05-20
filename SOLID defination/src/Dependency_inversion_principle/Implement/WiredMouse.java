package Dependency_inversion_principle.Implement;

import Dependency_inversion_principle.Interface.Mouse;

public class WiredMouse implements Mouse {
    @Override
    public void getMouse(String type) {
        System.out.println(type);
    }
}
