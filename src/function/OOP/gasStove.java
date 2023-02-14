package function.OOP;

public class GasStove {
    private int gasEye;
    private int elEye;
    private int energyGas;
    private int energyEl;
    private int totalEnergy;

    GasStove(int amountGasEye, int amountElEye) {
        setGasEye(amountGasEye);
        setElEye(amountElEye);
    }

    public int getTotalEnergy() {
        return totalEnergy;
    }

    public void setPlayGas(boolean play) {
        if (play) {
            this.energyGas = this.gasEye * 80;
        }
        totalEnergy += this.energyGas;
    }

    public int getPlayGas() {
        return energyGas;
    }

    public void setPlayEl(boolean play) {
        if (play) {
            this.energyEl = this.elEye * 100;
        }
        totalEnergy += this.energyEl;
    }

    public int getPlayEl() {
        return energyEl;
    }

    public void setGasEye(int x) {
        if (x < 3) {
            this.gasEye = 3;
        } else if (x > 5) {
            this.gasEye = 5;
        } else {
            this.gasEye = x;
        }
    }

    public int getGasEye() {
        return gasEye;
    }

    public void setElEye(int x) {
        if (x < 1) {
            this.elEye = 1;
        } else if (x > 3) {
            this.elEye = 3;
        } else {
            this.elEye = x;
        }
    }

    public int getElEye() {
        return elEye;
    }

    public static void main(String[] args) {
        GasStove gs1 = new GasStove(5, 3);
        gs1.setPlayGas(true);
        System.out.println(gs1.gasEye);
        System.out.println("Energy for gas eyes is " + gs1.energyGas);
        gs1.setPlayEl(true);
        System.out.println(gs1.elEye);
        System.out.println("Energy for electric eyes is " + gs1.energyEl);
        System.out.println("Total energy is " + gs1.totalEnergy);
    }
}
