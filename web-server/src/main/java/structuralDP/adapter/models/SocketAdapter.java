package structuralDP.adapter.models;

import structuralDP.adapter.Interfaces.AmericanSocket;
import structuralDP.adapter.Interfaces.EuroSocket;

public class SocketAdapter implements EuroSocket {
    AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }

}
