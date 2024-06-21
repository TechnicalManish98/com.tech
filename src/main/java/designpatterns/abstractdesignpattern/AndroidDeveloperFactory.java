package designpatterns.abstractdesignpattern;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory{

    @Override
    Employee getEmployee() {
        return new AndroidDeveloper();
    }
}
