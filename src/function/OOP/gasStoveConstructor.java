package function.OOP;

public class gasStoveConstructor {
    private int gasEye1, gasEye2, gasEye3;
    private int elEye1, elEye2;
    private int sumElEnergy;
    private int sumGasEnergy;
    int totalEnergy;
    private boolean playElectric;
    private boolean playGas;
    public void setPlayEye(boolean p1, boolean p2){
        this.playElectric = p1;
        this.playGas = p2;
        if (p1){
            elEye1 = elEye2 = 100;
            sumElEnergy = elEye1 + elEye2;
        }
        if (p2){
            gasEye1 = gasEye2 = gasEye3 = 80;
            sumGasEnergy = gasEye1 + gasEye2 + gasEye3;
        }
        totalEnergy = sumElEnergy + sumGasEnergy;
    }
    public int getTotalEnergy(){
        return totalEnergy;
    }
}
