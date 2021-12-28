package structuralDP.facade.service;

import structuralDP.facade.models.AirConditioner;
import structuralDP.facade.models.Light;
import structuralDP.facade.models.Tv;

public class RoomFacade {
    Tv tv  =  new Tv();
    Light light = new Light();
    AirConditioner airConditioner = new AirConditioner();

    public void pressButton(int temperature,String channel){
        tv.playChannel(channel);
        light.turnLight();
        airConditioner.setTemperature(temperature);
    }
}
