package OOP.Expands;

public class Employee extends Person {
    private String specialization;
    private int salary;

    Employee(String n, String s, int a, String ad, long pN, String sn, int salary) {
        super(n, s, a, ad, pN);
        specialization = sn;
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
