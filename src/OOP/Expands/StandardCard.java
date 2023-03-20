package OOP.Expands;

public class StandardCard extends BankCard {
    StandardCard(String name, String lastname, String address, int sumOfAccount) {
        super(new Person(name, lastname, address), sumOfAccount);
    }
}
