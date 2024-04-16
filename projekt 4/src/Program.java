import java.util.ArrayList;


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
