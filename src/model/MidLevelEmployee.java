package model;

public class MidLevelEmployee extends Employee {

    public MidLevelEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getStatus() {

        //CLEAN CODE TECHNIQUE:
        if (getSalary() < SENIOR_MIN_SALARY &&
                getSalary() >= MID_LEVEL_MIN_SALARY) {
                return "Supervisor";
        }  else {
            return super.getStatus();
        }
    }
}
