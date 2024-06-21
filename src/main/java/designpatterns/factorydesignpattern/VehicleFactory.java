package designpatterns.factorydesignpattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String name, String type) {
        if (type.equals("Bike")) {
            return new Bike(name, type);
        } else if (type.equals("Car")) {
            return new Car(name, type);
        } else if (type.equals("Bus")) {
            return new Bus(name, type);
        }
        return null;
    }
}
