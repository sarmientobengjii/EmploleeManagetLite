package model;

public class MidLevelEmployee extends Employee {
    public MidLevelEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getStatus() {
        if (getSalary() < 60000 && getSalary() >= 30000) {
            return "Supervisor";
        } else {
            return super.getStatus();
        }
    }
}
