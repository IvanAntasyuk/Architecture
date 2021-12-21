package structuralDP.adapter;

import structuralDP.adapter.Interfaces.EuroSocket;
import structuralDP.adapter.models.AmericanSocketImpl;
import structuralDP.adapter.models.Radio;
import structuralDP.adapter.models.SocketAdapter;


/*
 * Совмещает два разных интерфейса
 * Преобразует из одного интерфейса в другой
 */
public class Main {
    public static void main(String[] args) {
        AmericanSocketImpl americanSocket = new AmericanSocketImpl();
        Radio radio = new Radio();
        EuroSocket euroSocket = new SocketAdapter(americanSocket);
        radio.listenMusic(euroSocket);
    }
}
