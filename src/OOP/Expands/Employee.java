package OOP.Expands;

public class Employee extends Person {
    private String specialization;
    private int salary;

    Employee(String name, String surname, int age, String address, long phoneNumber, String specialization, int salary) {
        super(name, surname, address);
        this.specialization = specialization;
        setSalary(salary);
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getSalary() {
        return salary;
    }
}
