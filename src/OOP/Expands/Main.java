package OOP.Expands;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Aram", "Aramyan", 100000);
        Teacher sd = new SchoolDirector("Poxos", "Poxosyan", 140000, 6);
        Teacher ht = new HeadTeacher("Davit", "Arzumanyan", 120000, 1.8);
        System.out.println(t.getSalary());
        System.out.println(sd.getSalary());
        System.out.println(ht.getSalary());
    }
}
