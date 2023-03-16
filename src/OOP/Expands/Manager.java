package OOP.Expands;

public class Manager extends Employee {
    private String department;

    Manager(String name, String surename, int age, String address, long phoneNumber, String specialization, int salary, String department) {
        super(name, surename, age, address, phoneNumber, specialization, salary);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
