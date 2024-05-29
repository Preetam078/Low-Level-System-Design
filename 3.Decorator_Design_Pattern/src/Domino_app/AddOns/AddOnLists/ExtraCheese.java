package Domino_app.AddOns.AddOnLists;

import Domino_app.AddOns.AddOns;
import Domino_app.BasePizza.BasePizza;

public class ExtraCheese extends AddOns {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
}
