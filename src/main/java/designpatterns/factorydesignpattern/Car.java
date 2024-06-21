package designpatterns.factorydesignpattern;

public class Car extends Vehicle {

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getSeatingCapacity() {
        return this.seatingCap = "4";
    }
}
