import java.util.ArrayList;

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