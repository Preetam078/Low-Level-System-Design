package Interface_Segmentation_principle;

/*
 * In this Principle ==> Break the Interface into as small piece as you can
 * ==> No Extra function should be implemented inside the interface.....
 *
 */


import Interface_Segmentation_principle.Implementation.Waiter;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(".....Welcome LLD Resturent.....");
        Waiter waiter = new Waiter();
        ArrayList<String>order = new ArrayList<String>(Arrays.asList("noodle","burger","pizza"));
        waiter.takeOrders(order);
        waiter.serverOrder();
    }
}
