package designpatterns.builderpattern;

public class Customer {

    private String firstName;
    private String lastName;
    private String mobileNo;
    private String age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    private Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.firstName;
        this.lastName = customerBuilder.lastName;
        this.mobileNo = customerBuilder.mobileNo;
        this.age = customerBuilder.age;
    }

    public static class CustomerBuilder {
        private String firstName;
        private String lastName;
        private String mobileNo;
        private String age;

        public CustomerBuilder() {
        }

        public CustomerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
            return this;
        }

        public CustomerBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
