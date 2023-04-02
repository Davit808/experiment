package OOP.OnlineShop;

import OOP.OnlineShop.Electronics;

public class Phone extends Electronics {
    private int countSimCard = 1;

    public Phone(String type, String companyName, String modelName, double costPrice, double salePrice, int countSimCard) {
        super(type, companyName, modelName, costPrice, salePrice);
        if(countSimCard > 1 && countSimCard < 4) {
            this.countSimCard = countSimCard;
        }
    }

    public int getCountSimCard() {
        return countSimCard;
    }
}