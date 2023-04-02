package OOP.OnlineShop;

public class Headphones extends Electronics{
    private boolean wirelessHeadset;
    private double lengthWire;
    public Headphones(String type, String companyName, String modelName, double costPrice, double salePrice, boolean wirelessHeadset) {
        super(type, companyName, modelName, costPrice, salePrice);
        this.wirelessHeadset = wirelessHeadset;
    }
    public Headphones(String type, String companyName, String modelName, double costPrice, double salePrice, double lengthWire) {
        super(type, companyName, modelName, costPrice, salePrice);
        if (lengthWire >= 1 && lengthWire <=2){
            this.lengthWire = lengthWire;
        } else {
            this.lengthWire = 1;
        }
    }

    public boolean isWirelessHeadset() {
        return wirelessHeadset;
    }

    public double getLengthWire() {
        return lengthWire;
    }
}
