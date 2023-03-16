package OOP.Expands;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Davit", "Arzumanyan", 30, "HH, Syunik, Goris, Verishen", 37477123456l);
        System.out.println("Address of " + p1.getName() + " is " + p1.getAddress());
        Employee e1 = new Employee("Armen", "Aramyan", 25, "HH, Syunik, Goris", 37499123456l, "Project manager", 5000);
        System.out.println(e1.getSpecialization() + " " + "Salary is " + e1.getSalary() + "$");
        e1.setSalary(3000);
        System.out.println(e1.getSpecialization() + " " + "Salary is " + e1.getSalary() + "$");
        Manager m1 = new Manager("Poxos", "Poxosyan", 30, "USE, Lndon", 10055123456l, "Manajer of testing", 6500, "Automation testing");
        System.out.println(m1.getDepartment());
    }
}
