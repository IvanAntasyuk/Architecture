package structuralDP.decorator.models;

import structuralDP.decorator.interfaces.Pizza;

public class DoughPizza implements Pizza {

    @Override
    public String makePizza() {
        return "Pizza with";
    }
}
