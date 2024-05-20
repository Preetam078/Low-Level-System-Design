package Interface_Segmentation_principle.Implementation;

import Interface_Segmentation_principle.interfaces.ChiefInterface;

import java.util.ArrayList;

public class Cook implements ChiefInterface {
    private ArrayList<String>preparedDishes = new ArrayList<>();
    @Override
    public void cookDishes(String dish) {
        System.out.println("Chief Cooking......"+dish);
    }

    @Override
    public void takeOrderFromWaiter(ArrayList<String> order) {
        for(String dish : order) {
            cookDishes(dish);
            preparedDishes.add(dish);
        }

    }

    @Override
    public ArrayList<String> handOverDishesToWaiter() {
        return preparedDishes;
    }
}
