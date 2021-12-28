package structuralDP.adapter.models;

import structuralDP.adapter.Interfaces.EuroSocket;

public class Radio {
    public void listenMusic(EuroSocket euroSocket){
        euroSocket.getPower();
        System.out.println("Radio play");
    }
}
