package streamsRelated;

import java.util.List;

public class Employee {

    int id;
    String name;
    String designation;
    List<Address> address;

    public Employee(int id, String name, String designation, List<Address> address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", address=" + address +
                '}';
    }
}
