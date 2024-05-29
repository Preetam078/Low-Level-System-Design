package Domino_app.AddOns.AddOnLists;

import Domino_app.AddOns.AddOns;
import Domino_app.BasePizza.BasePizza;

public class ExtraToppings extends AddOns {
    BasePizza basePizza;

    public  ExtraToppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 70;
    }
}
