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