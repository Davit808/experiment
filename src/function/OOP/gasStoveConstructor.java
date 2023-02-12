package function.OOP;

public class gasStoveConstructor {
    int gasEye1, gasEye2, gasEye3;
    int elEye1, elEye2;
    int totalEnergy;
    gasStoveConstructor(boolean p1, boolean p2){
        boolean playElectric;
        boolean playGas;
        playElectric = p1;
        playGas = p2;
        if (p1){
            elEye1 = elEye2 = 100;
        }
        int totalElectricEnergy = elEye1 + elEye2;
        if(p2){
            gasEye1 = gasEye2 = gasEye3 = 80;
        }
        int totalGasEnergy = gasEye1 + gasEye2 + gasEye3;
        totalEnergy = totalElectricEnergy + totalGasEnergy;
    }
}
