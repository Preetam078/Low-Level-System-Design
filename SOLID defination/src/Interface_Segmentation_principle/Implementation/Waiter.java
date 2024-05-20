package Interface_Segmentation_principle.Implementation;

import Interface_Segmentation_principle.interfaces.WaiterInterface;

import java.util.ArrayList;

public class Waiter implements WaiterInterface {
    public ArrayList<String>orders;
    private Cook cook;

    public Waiter() {
        cook = new Cook();
    }

    @Override
    public void takeOrders(ArrayList<String> orders) {
        orders = new ArrayList<String>(orders);
        System.out.println("Waiter had taken the Order.....");
        cook.takeOrderFromWaiter(orders);
    }

    @Override
    public void serverOrder() {
        ArrayList<String>dishesToServe = cook.handOverDishesToWaiter();
        for(String dish : dishesToServe) {
            System.out.println("Waiter Serving ......"+dish);
        }
    }
}
