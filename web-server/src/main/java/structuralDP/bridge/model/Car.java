package structuralDP.bridge.model;

import structuralDP.bridge.interfaces.Model;

public class Car extends Vehicle{
    public Car(Model model) {
        super(model);
    }

    @Override
    public void drive() {
        model.drive("Car Drive");
    }
}
