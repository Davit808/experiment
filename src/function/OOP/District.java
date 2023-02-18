package function.OOP;

import java.util.Objects;

public class District {
    private double gardenArea;
    private Building[] infoOfBuildings;
    private double result;
    District( Building[] buildings, double garden){
        gardenArea = garden;
        infoOfBuildings = buildings;
        result = resultGardenArea();
    }

    public Building[] getInfoOfBuildings() {
        return infoOfBuildings;
    }

    public double getGardenArea() {
        return gardenArea;
    }

    public double getResult() {
        return result;
    }

    private double resultGardenArea(){
        double sum = 0.0;
        for(int i = 0; i < infoOfBuildings.length; i++){
            sum += infoOfBuildings[i].getTotalRooms();
        }
        return gardenArea / sum;
    }
}
