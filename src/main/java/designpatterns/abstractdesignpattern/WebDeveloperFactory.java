package designpatterns.abstractdesignpattern;

public class WebDeveloperFactory extends EmployeeAbstractFactory {

    @Override
    Employee getEmployee() {
        return new WebDeveloper();
    }
}
