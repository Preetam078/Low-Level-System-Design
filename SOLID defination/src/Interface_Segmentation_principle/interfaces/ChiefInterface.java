package Interface_Segmentation_principle.interfaces;

import java.util.ArrayList;

public interface ChiefInterface {
    public void cookDishes(String dish);
    public void takeOrderFromWaiter(ArrayList<String>order);
    public ArrayList<String> handOverDishesToWaiter();
}
