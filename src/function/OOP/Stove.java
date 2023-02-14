package function.OOP;

public class Stove {
    private int gasEye;
    private int elEye;
    private int gasEnergy;
    private int elEnergy;
    private int totalEnergy;

    Stove(int amountGasEyes, int amountElEyes) {
        setGasEye(amountGasEyes);
        setElEye(amountElEyes);
    }

    public void setGasEye(int amount) {
        if (amount < 3) {
            this.gasEye = 3;
        } else if (amount > 5) {
            this.gasEye = 5;
        } else {
            this.gasEye = amount;
        }
    }
    public int getGasEye() {
        return this.gasEye;
    }
    public void setElEye(int amount) {
        if (amount < 1) {
            this.elEye = 1;
        } else if (amount > 3) {
            this.elEye = 3;
        } else {
            this.elEye = amount;
        }
    }
    public int getElEye() {
        return this.elEye;
    }
    public void setGasEnergy(boolean play) {
        if (play) {
            this.gasEnergy = this.gasEye * 80;
        }
        this.totalEnergy += this.gasEnergy;
    }
    public int getGasEnergy() {
        return this.gasEnergy;
    }
    public void setElEnergy(boolean play) {
        if (play) {
            this.elEnergy = this.elEye * 100;
        }
        this.totalEnergy += this.elEnergy;
    }
    public int getElEnergy() {
        return this.elEnergy;
    }
    public int getTotalEnergy() {
        return this.totalEnergy;
    }
    public static void main(String[] args) {
        Stove gs1 = new Stove(3, 1);
        gs1.setGasEnergy(false);
        gs1.setElEnergy(false);
        System.out.println("amount gas eyes for gs1 is " + gs1.gasEye + " and " + "amount electric eyes for gs1 is " + gs1.elEye);
        System.out.println("gas energy is " + gs1.gasEnergy + " " + "electric energy is " + gs1.elEnergy + " total energy for gas stove is " + gs1.totalEnergy);
    }
}
