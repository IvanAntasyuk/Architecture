package structuralDP.bridge.model;

import structuralDP.bridge.interfaces.Model;

public class Truck extends Vehicle{
    public Truck(Model model) {
        super(model);
    }

    @Override
   public void drive() {
        model.drive("Truck drive");
    }
}
