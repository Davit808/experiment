package OOP.Expands;

public class Teacher {
    private String name;
    private String surname;
    private double salary;

    Teacher(String name, String surname, double salary){
        this.name = name;
        this.surname = surname;
        setSalary(salary);
    }
    public void setSalary(double salary) {
        if (salary >= 65000 && salary <= 120000) {
            this.salary = salary;
        } else {
            System.out.println("It's a invalid input data");
            System.exit(1);
        }
    }
    public double getSalary() {
        return salary;
    }
}
