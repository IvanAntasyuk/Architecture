package structuralDP.decorator.models;

import structuralDP.decorator.interfaces.Pizza;

public class Ham implements Pizza {
    Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " ham";
    }
}
