package function.OOP;

public class Building {
    private String typeOfBuilding;
    private int amountOfFloors;
    private int amountOfTwoRooms;
    private int amountOfThreeRoms;
    private int sumOfRooms;

    Building(String type, int amountOfFloors, int amountOfTwoRooms, int amountOfThreeRoms) {
        this.amountOfFloors = amountOfFloors;
        this.amountOfTwoRooms = amountOfTwoRooms;
        this.amountOfThreeRoms = amountOfThreeRoms;
        sumOfRooms = amountOfTwoRooms + amountOfThreeRoms;
        if (type == "panel" || type == "monolithic") {
            typeOfBuilding = type;
        } else {
            System.out.println("You can't enter this " + type + " type" + "\nEnter the valid type");
        }
    }

    public int getAmountOfFloors() {
        return amountOfFloors;
    }

    public int getAmountOfTwoRooms() {
        return amountOfTwoRooms;
    }

    public int getAmountOfThreeRoms() {
        return amountOfThreeRoms;
    }

    public int getSumOfRooms() {
        return sumOfRooms;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

}
