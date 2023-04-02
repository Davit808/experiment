package OOP.Expands;

public class BusinessCard extends BankCard {
    private String type = "Business Card";
    private boolean creditIsTaken = false;

    public BusinessCard(String name, String lastname, String address, int mount, int year) {
        super(new Person(name, lastname, address), mount, year);
    }
    @Override
    public void setOnlinePayment(int onlinePayment) {
        if (onlinePayment > getSumOfAccount()) {
            System.out.println("You don't have that count sum for your balance");
        } else if (onlinePayment <= 0) {
            System.out.println("it's a bad data tape");
        } else {
            setExitSum((onlinePayment * 90) / 100);
        }
    }
}
