package structuralDP.bridge;

import structuralDP.bridge.model.*;

public class Main {

    public static void main(String[] args) {
        Vehicle car1 = new Car(new Bmw());
        Vehicle car2 = new Car(new Suzuki());

        Vehicle truck1 = new Truck(new Suzuki());
        Vehicle truck2 = new Truck(new Honda());
        Vehicle moto = new Motorcycle(new Honda());

        car1.drive();
        truck1.drive();
        moto.drive();


    }
}
