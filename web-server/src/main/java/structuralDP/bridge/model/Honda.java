package structuralDP.bridge.model;

import structuralDP.bridge.interfaces.Model;

public class Honda implements Model {
    @Override
    public void drive(String s) {
        System.out.println(s + " Honda");
    }
}
