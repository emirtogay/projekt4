


        import java.util.ArrayList;

class Employee {
    String firstName;
    String lastName;
    String address;
    String email;
    String pesel;
    int yearOfEmployment;
    int salary;
    Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = 3000 + (2024 - this.yearOfEmployment) * 1000;

    }

    int getSalary() {

        return this.salary;

    }

}
class Developer extends Employee {

    ArrayList<Integer> technologyBonuses;

    Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {

        super(firstName, lastName, address, email, pesel, yearOfEmployment);

        this.technologyBonuses = new ArrayList<>();

    }

    void addTechnologyBonus(int bonus) {

        technologyBonuses.add(bonus);

    }

    int getSalary() {

        int techBonus = 0;

        for(int bonus : technologyBonuses) {

            techBonus += bonus;

        }

        return super.getSalary() + techBonus;

    }

}
class Tester extends Employee {

    int testCount;
    Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {

        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.testCount = 0;

    }

    void addTest() {

        this.testCount += 1;

    }

    int getSalary() {

        return super.getSalary() + this.testCount * 300;

    }

}
class Manager extends Employee {

    int goalBonus;
    Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {

        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.goalBonus = 0;

    }

    void addGoalBonus(int bonus) {

        this.goalBonus += bonus;

    }

    int getSalary() {

        return super.getSalary() + this.goalBonus;

    }

}

public class Program {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Developer dev = new Developer("John", "Doe", "New York", "johndoe@example.com", "123456789", 2020);

        dev.addTechnologyBonus(800);

        employees.add(dev);


        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "janesmith@example.com", "987654321", 2021);

        tester.addTest(); // Call this method as many times as there are tests

        employees.add(tester);

        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bobjohnson@example.com", "1122334455", 2019);

        manager.addGoalBonus(1000); // Assuming a goal was reached in the current month

        employees.add(manager);

        int totalAmount = 0;

        for (Employee employee : employees) {

            totalAmount += employee.getSalary();

        }

        System.out.println("Total amount to be paid this month: " + totalAmount + " PLN");

    }

}
