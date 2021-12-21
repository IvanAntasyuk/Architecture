package structuralDP.adapter.models;

import structuralDP.adapter.Interfaces.AmericanSocket;

public class AmericanSocketImpl implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("Get power 110 volt");
    }
}
