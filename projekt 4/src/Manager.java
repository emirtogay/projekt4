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

