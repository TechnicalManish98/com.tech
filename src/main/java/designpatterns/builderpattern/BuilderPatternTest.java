package designpatterns.builderpattern;

public class BuilderPatternTest {

    public static void main(String[] args) {
        Customer customer = new Customer.CustomerBuilder()
                .setFirstName("Manish")
                .setLastName("Lande")
                .setMobileNo("9967754332")
                .setAge("27")
                .build();

        System.out.println("customer details : " + customer.toString());
    }
}
