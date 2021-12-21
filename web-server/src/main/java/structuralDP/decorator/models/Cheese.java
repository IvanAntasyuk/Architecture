package structuralDP.decorator.models;

import structuralDP.decorator.interfaces.Pizza;

public class Cheese implements Pizza {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " cheese";
    }
}
