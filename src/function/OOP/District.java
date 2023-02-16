package function.OOP;

public class District {
    private int areaOfTheGarden;
    private int sumAllBuildingOfRooms;
    private double result;

    District(int garden, int... sumOfThisBuilding) {
        areaOfTheGarden = garden;
        for (int i : sumOfThisBuilding) {
            sumAllBuildingOfRooms += i;
        }
        result = 1.0 * areaOfTheGarden / sumAllBuildingOfRooms;
    }

    public int getAreaOfTheGarden() {
        return areaOfTheGarden;
    }

    public int getSumAllBuildingOfRooms() {
        return sumAllBuildingOfRooms;
    }

    public double getResult() {
        return (double) result;
    }
}
