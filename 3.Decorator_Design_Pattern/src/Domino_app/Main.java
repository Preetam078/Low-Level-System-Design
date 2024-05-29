package Domino_app;

import Domino_app.AddOns.AddOnLists.ExtraCheese;
import Domino_app.AddOns.AddOns;
import Domino_app.BasePizza.BasePizza;
import Domino_app.BasePizza.PizzaTypes.Margarita;

/**
 * Decorator Pattern => when you have the choice to choose further eg: Pizza App, Subway, Coffee Machine....
 * */

public class Main {
    public static void main(String[] args) {
        BasePizza margarita = new Margarita();
        AddOns extraCheese = new ExtraCheese(margarita);

        System.out.println(extraCheese.cost());
    }
}