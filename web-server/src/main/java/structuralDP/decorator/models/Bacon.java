package structuralDP.decorator.models;

import structuralDP.decorator.interfaces.Pizza;

public class Bacon implements Pizza {
    Pizza pizza;


    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String makePizza() {
        return pizza.makePizza() + " bacon";
    }
}
