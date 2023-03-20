package OOP.Expands;

public class BusinessCard extends BankCard {
    private int creditSum;
    private boolean creditIsTaken = false;

    BusinessCard(String name, String lastname, String address, int sumOfAccount) {
        super(new Person(name, lastname, address), sumOfAccount);
    }

    public void setCreditSum(boolean credit) {
        if (creditIsTaken) {
            System.out.println("You can't use this loan type a second time");
            System.exit(1);
        }
        this.creditSum = 1000000;
        this.creditIsTaken = true;
    }

    public int getCreditSum() {
        return creditSum;
    }
}
