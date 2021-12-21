package structuralDP.facade;

import structuralDP.facade.models.BedRoom;
import structuralDP.facade.models.LivingRoom;

public class Main {

    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.pressButton(21, "FOX");

        BedRoom bedRoom = new BedRoom();
        bedRoom.pressButton(18,"CNN");

    }
}
