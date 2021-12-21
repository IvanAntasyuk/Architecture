package structuralDP.decorator;

import structuralDP.decorator.interfaces.Pizza;
import structuralDP.decorator.models.Bacon;
import structuralDP.decorator.models.Cheese;
import structuralDP.decorator.models.DoughPizza;

public class Main {
    public static void main(String[] args) {
        Pizza dough = new DoughPizza();
        Pizza baconAndDough = new Bacon(dough);
        Pizza cheese = new Cheese(baconAndDough);
        System.out.println(cheese.makePizza());

    }
}
