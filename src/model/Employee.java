package model;

public class Employee {

    protected static final double MID_LEVEL_MIN_SALARY = 30000;
    protected static final double SENIOR_MIN_SALARY = 60000;

        private final String name;
        private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //GETTERS
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    /*
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
     */

    public String getStatus() {
        if (salary >= 60000) {
            return "Senior Manager.";
        } else if (salary < 60000 && salary >= 30000) {
            return "Supervisor.";
        } else {
            return "Regular Employee.";
        }
    }

    public void introduce() {
        System.out.println(
                "Hi, I'm " + name +
                ", I'm a " + getStatus()
        );
    }
}
