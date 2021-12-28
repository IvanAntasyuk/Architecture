package structuralDP.facade.models;

import structuralDP.facade.service.RoomFacade;

public class LivingRoom {
    RoomFacade roomFacade = new RoomFacade();

    public void pressButton(int temperature,String channel){
        roomFacade.pressButton(temperature,channel);
    }
}
