package designpatterns.abstractdesignpattern;

public class Client {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println("Designation : " + employee.designation() + " And Salary : " + employee.salary());

    }
}
