package designpatterns.factorydesignpattern;

public class Bike extends Vehicle {

    public Bike() {
    }

    public Bike(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getSeatingCapacity() {
        return this.seatingCap = "2";
    }
}
