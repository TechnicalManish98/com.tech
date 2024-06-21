package designpatterns.abstractdesignpattern;

public class WebDeveloper extends Employee {
    @Override
    String designation() {
        return "Web Developer";
    }

    @Override
    String salary() {
        return "1000000";
    }
}
