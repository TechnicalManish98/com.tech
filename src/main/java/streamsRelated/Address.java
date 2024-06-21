package streamsRelated;

import java.util.Objects;

public class Address {

    String district;
    int pinCode;

    public Address(String district, int pinCode) {
        this.district = district;
        this.pinCode = pinCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "district='" + district + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
