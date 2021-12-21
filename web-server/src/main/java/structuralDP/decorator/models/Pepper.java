package structuralDP.decorator.models;

import structuralDP.decorator.interfaces.Pizza;

public class Pepper implements Pizza {
    Pizza pizza;

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " pepper";
    }
}
