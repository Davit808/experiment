package OOP.Expands;

public class StandardCard extends BankCard {
    private String type = "Standard Card";

    StandardCard(String name, String lastname, String address, int mount, int year) {
        super(new Person(name, lastname, address), mount, year);
    }

    public String getType() {
        return type;
    }
}
