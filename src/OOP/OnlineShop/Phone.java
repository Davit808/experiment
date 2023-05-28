package OOP.OnlineShop;

public class Phone extends Electronics implements WiFi{
    private int countSimCard = 1;
    private boolean wifi;

    public Phone(String type, String companyName, String modelName, double costPrice, double salePrice, int countSimCard, boolean wifi) {
        super(type, companyName, modelName, costPrice, salePrice);
        if (countSimCard > 1 && countSimCard < 4) {
            this.countSimCard = countSimCard;
        }
        this.wifi = wifi;
    }

    public Phone(String type, String companyName, String modelName, double costPrice, double salePrice, int countSimCard) {
        super(type, companyName, modelName, costPrice, salePrice);
        if (countSimCard > 1 && countSimCard < 4) {
            this.countSimCard = countSimCard;
        }
    }

    @Override
    public void wifi() {
        if (wifi) {
            System.out.println("this " + getType() + " Have a Wifi");
        } else {
            System.out.println("this " + getType() + " Haven't Wifi");
        }
    }

    public int getCountSimCard() {
        return countSimCard;
    }
}