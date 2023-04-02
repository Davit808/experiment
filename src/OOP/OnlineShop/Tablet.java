package OOP.OnlineShop;

public class Tablet extends Electronics{
    private String typeOS;
    private short countSimCard = 1;
    private short screenSize = 9;

    public Tablet(String type, String companyName, String modelName, double costPrice, double salePrice, int countSimCard, int screenSize) {
        super(type, companyName, modelName, costPrice, salePrice);
        if (companyName == "Iphone"){
            this.typeOS = "IS";
        } else {
            this.typeOS = "Android";
        }
        if (screenSize >= 7 && screenSize <= 12) {
            this.screenSize = (short) screenSize;
        }
        if(countSimCard == 2) {
            this.countSimCard = (short)countSimCard;
        }
    }

    public String getTypeOS() {
        return typeOS;
    }

    public int getCountSimCard() {
        return countSimCard;
    }

    public short getScreenSize() {
        return screenSize;
    }
}
