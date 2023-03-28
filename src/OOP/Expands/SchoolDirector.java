package OOP.Expands;

public class SchoolDirector extends Teacher {
    private double workExperience;
    private double coefficientForWorkExperience;
    private double salary;

    SchoolDirector(String name, String surname, double salary, double workExperience) {
        super(name, surname, salary);
        this.workExperience = workExperience;
        if (workExperience > 0 && workExperience < 10) {
            coefficientForWorkExperience = workExperience / 10;
        } else if (workExperience >= 10 && workExperience < 15) {
            coefficientForWorkExperience = 1.5;
        } else if (workExperience >= 15 || workExperience <= 41) {
            coefficientForWorkExperience = 2.5;
        } else {
            System.out.println("It's a invalid input data");
        }
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > 120000 && salary < 200000) {
            this.salary = salary + salary * coefficientForWorkExperience;
        } else {
            System.out.println("It's a invalid input data");
            System.exit(1);
        }
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
