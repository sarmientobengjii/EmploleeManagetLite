import model.Employee;
import model.MidLevelEmployee;
import model.SeniorEmployee;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>(); //ARRAYLIST
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            showMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {

                case 1:
                    addEmployee(scanner, employees);
                    break;

                case 2:
                    viewEmployee(employees);
                    break;

                case 3:
                    running = false;
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Exit Program");
}

    public static void addEmployee(Scanner scanner, ArrayList<Employee> employees) {

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter salary: ₱.");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Employee e;

        if (salary >= 60000) {
            e = new SeniorEmployee(name, salary);
        } else if (salary < 60000 && salary >= 30000) {
            e = new MidLevelEmployee(name, salary);
        } else {
            e = new Employee(name, salary);
        }

        employees.add(e);

        System.out.println("Employee added successfully.");
    }

    public static void viewEmployee(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("Employee list is empty.");
        } else {
            for (Employee e : employees ) {
                e.introduce();
            }
        }
    }
}

