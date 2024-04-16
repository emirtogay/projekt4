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