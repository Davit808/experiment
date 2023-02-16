package function.OOP;

public class Main {
    public static void main(String[] args) {
        Building b1 = new Building("panel", 5, 10, 3);
        Building b2 = new Building("panel", 6, 12, 5);
        Building b3 = new Building("monolithix", 9, 25, 10);
        Building b4 = new Building("monolithic", 3, 6, 6);
        District center = new District(1000, b1.getSumOfRooms(), b2.getSumOfRooms(), b3.getSumOfRooms(), b4.getSumOfRooms());
        System.out.println(center.getSumAllBuildingOfRooms());
        System.out.println(center.getResult());
        System.out.println(1000/82);
    }
}
