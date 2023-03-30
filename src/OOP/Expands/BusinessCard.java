package OOP.Expands;

public class BusinessCard extends BankCard {
    private int sumOfAccount;
    private String type = "Business Card";
    private boolean creditIsTaken = false;

    BusinessCard(String name, String lastname, String address, int mount, int year) {
        super(new Person(name, lastname, address), mount, year);
    }

    @Override
    public void setInputOfAccount(int inputOfAccount) {
        if (inputOfAccount + sumOfAccount + 1000000 <= 2000000) {
            this.sumOfAccount += inputOfAccount;
        } else {
            System.out.println("You can't have that count sum for your account");
        }
    }

    public void setCreditSum(boolean credit) {
        if (creditIsTaken) {
            System.out.println("You can't use this loan type a second time");
        } else {
            sumOfAccount = getSumOfAccount() + 1000000;
            this.creditIsTaken = true;
        }
    }

    @Override
    public void setOnlinePayment(int sum) {
        if (sum > 0 && sum <= getSumOfAccount()) {
            setExitSum((sum * 90) / 100);
        } else if (sum > getSumOfAccount()) {
            System.out.println("You can't have that sum in the your account");
        }
    }

    @Override
    public String toString() {
        return this.getInfoOfUser().getName() + "\n" + this.getAccountNumber() + "\n" + this.getExpirationYear() + "\n" + type;
    }

    @Override
    public int getSumOfAccount() {
        System.out.println(sumOfAccount);
        return this.sumOfAccount;
    }
}
