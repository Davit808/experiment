package OOP.OnlineShop;

public class LoyalCustomerCard {
    private String name;
    private String surname;
    private int points = 0;
    private int numberCard;
    static int count;

    public LoyalCustomerCard(String name, String surname) {
        this.name = name;
        this.surname = surname;
        count ++;
        this.numberCard = count;
    }

    public void Points(double sum) {
        this.points = this.points + (int) (sum / 100);
    }

    public double getPoints() {
        return points;
    }

    public int getNumberCard() {
        return numberCard;
    }
}
