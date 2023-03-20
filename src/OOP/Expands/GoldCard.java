package OOP.Expands;

public class GoldCard extends BankCard{
    private double allowanceForLaunch = 100000;
    private double outputForLaunch;
    GoldCard(String name, String lastname, String address, int sumOfAccount) {
        super(new Person(name, lastname, address), sumOfAccount);
    }
    public void setOutputForLaunch(double outputForLaunch){
        if (outputForLaunch < 0.01 || outputForLaunch > 3000){
            System.out.println("You can't receive that amount of money for launch");
            System.exit(1);
        }
        else this.allowanceForLaunch -= outputForLaunch;
    }

    public double getAllowanceForLaunch() {
        return allowanceForLaunch;
    }
}
