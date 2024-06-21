package designpatterns.factorydesignpattern;

public class DesignPatternTest {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Honda", "Bike");
        System.out.println(vehicle.type + " seating capacity is : " + vehicle.getSeatingCapacity());

        Vehicle vehicle2 = VehicleFactory.getVehicle("Ashok leyland", "Bus");
        System.out.println(vehicle2.type + " seating capacity is : " + vehicle2.getSeatingCapacity());

        Vehicle vehicle3 = VehicleFactory.getVehicle("Tata", "Car");
        System.out.println(vehicle3.type + " seating capacity is : " + vehicle3.getSeatingCapacity());

    }
}
