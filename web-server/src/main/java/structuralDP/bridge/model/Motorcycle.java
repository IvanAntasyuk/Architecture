package structuralDP.bridge.model;

import structuralDP.bridge.interfaces.Model;

public class Motorcycle extends Vehicle{
    public Motorcycle(Model model) {
        super(model);
    }

    @Override
   public void drive() {
        model.drive("Motorcycle Drive");
    }
}
