package OOP.Expands;

public class GoldCard extends BankCard {
    private String type = "Gold Card";
    private double allowanceForLaunch = 100000;
    private double outputForLaunch;
    private int countOfPoint;

    GoldCard(String name, String lastname, String address, int mount, int year) {
        super(new Person(name, lastname, address), mount, year);
    }

    public void setOutputForLaunch(double outputForLaunch) {
        if (outputForLaunch < 0.01 || outputForLaunch > 3000) {
            System.out.println("You can't receive that amount of money for launch");
            System.exit(1);
        } else this.allowanceForLaunch -= outputForLaunch;
    }

    @Override
    public void setOnlinePayment(int sum) {
        if (sum > 0 && sum < getSumOfAccount()) {
            setExitSum(sum);
            this.countOfPoint += 2;
        }
    }

    @Override
    public void sout() {
        System.out.println(this.getInfoOfUser().getName());
        System.out.println(this.getAccountNumber());
        System.out.println(this.getExpirationYear());
        System.out.println(type);
    }

    public double getAllowanceForLaunch() {
        return allowanceForLaunch;
    }

    public int getCountOfPoint() {
        return countOfPoint;
    }
}

