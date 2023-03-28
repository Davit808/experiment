package OOP.Expands;

public class HeadTeacher extends Teacher {
    private double coefficient;

    HeadTeacher(String name, String surname, double salary,  double coefficient) {
        super(name, surname, salary);
        if (coefficient >= 1.5 && coefficient <= 2.0) {
            this.coefficient = coefficient;
        } else {
            System.out.println("You can't used its function the second time");
            System.exit(1);
        }
    }
    @Override
    public double getSalary(){
        return super.getSalary() * coefficient;
    }
}
