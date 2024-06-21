package designpatterns.factorydesignpattern;

public class Bus extends Vehicle {

    public Bus(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getSeatingCapacity() {
        return this.seatingCap = "20";
    }
}
