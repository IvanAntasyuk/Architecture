package structuralDP.bridge.model;

import structuralDP.bridge.interfaces.Model;

public abstract class Vehicle {
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

   public abstract void drive();
}
