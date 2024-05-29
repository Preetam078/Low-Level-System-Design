package Domino_app.AddOns.AddOnLists;

import Domino_app.AddOns.AddOns;
import Domino_app.BasePizza.BasePizza;

public class NoAddOn  extends AddOns {
    BasePizza basePizza;

    public NoAddOn(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost();
    }
}
