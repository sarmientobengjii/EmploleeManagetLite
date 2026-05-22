package model;

public class SeniorEmployee extends Employee {
    public SeniorEmployee (String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getStatus() {
        if (getSalary() >= 60000) {
            return "Senior Employee";
        } else {
            return super.getStatus();
        }
    }
}
