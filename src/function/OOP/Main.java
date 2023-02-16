package function.OOP;

public class Main {
    public static void main(String[] args) {
        Building b1 = new Building("panel", 5, 10, 3);
        Building b2 = new Building("panel", 6, 12, 5);
        Building b3 = new Building("monolithic", 9, 25, 10);
        Building b4 = new Building("monolithic", 3, 6, 6);
        District center = new District(1000, b1.getSumOfRooms(), b2.getSumOfRooms(), b3.getSumOfRooms(), b4.getSumOfRooms());
        System.out.println(center.getSumAllBuildingOfRooms());
        System.out.println(center.getResult());

        Sportsman human1 = new Sportsman("Muhammad Ali", 45, 98, 95, 120, 95, 50);
        Sportsman human2 = new Sportsman("Mike Tyson", 65, 85, 93, 70, 90, 99);
        System.out.println(human1.getResult());
        System.out.println(human2.getResult());
        Comparison returnH1VSH2 = new Comparison(human1.getResult(), human2.getResult());
        System.out.println(returnH1VSH2.getCompareTheResults());
    }
}
