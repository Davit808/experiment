package OOP;

public class Building {
    private int amountOfFloors;
    private int[] numbersTwoRooms;
    private int[] numbersThreeRooms;
    private String typeOfBuilding;
    private int totalRooms;

    Building(int floors, int[] twoRooms, int[] threeRooms, String type) {
        amountOfFloors = floors;
        typeOfBuilding = type;
        setNumbersTwoRooms(twoRooms);
        setNumbersThreeRooms(threeRooms);
        totalRooms = sumOfAllRooms();
    }

    public void setAmountOfFloors(int amount) {
        if (amount < 1) {
            System.out.println("You can't enter this amount of floors");
            System.exit(1);
        } else {
            this.amountOfFloors = amount;
        }
    }

    public int getAmountOfFloors() {
        return amountOfFloors;
    }

    public void setNumbersTwoRooms(int[] twoRooms) {
        for (int i : twoRooms) {
            if (i < 0) {
                System.out.println("You can't enter this number of room");
                System.exit(1);
            } else {
                this.numbersTwoRooms = twoRooms;
            }
        }
    }

    public int[] getNumbersTwoRooms() {
        return numbersTwoRooms;
    }

    public void setNumbersThreeRooms(int...threeRooms) {
        for (int i : threeRooms) {
            if (i < 0) {
                System.out.println("You can't enter this number of room");
                System.exit(1);
            } else {
                this.numbersThreeRooms = threeRooms;
            }
        }
    }

    public int[] getNumbersThreeRooms() {
        return numbersThreeRooms;
    }

    public String setTypeOfBuilding(String type) {
        if (type == "panel" || type == "monolithic") {
            this.typeOfBuilding = type;
        } else {
            System.out.println("You can't enter this type");
            System.exit(1);
        }
        return typeOfBuilding;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    private int sumOfAllRooms() {
        int sum = numbersTwoRooms.length + numbersThreeRooms.length;
        return sum;
    }

    public int getTotalRooms() {
        return totalRooms;
    }
}