package OOP.OnlineShop;

public class TV extends Electronics {

    private boolean isSmart;
    private boolean wifi;
    private boolean kabelTV = true;


    public TV(String type, String companyName, String modelName, double costPrice, double salePrice, boolean isSmart) {
        super(type, companyName, modelName, costPrice, salePrice);
        if (isSmart) {
            this.isSmart = true;
            this.wifi = wifi;
        }
    }

    public boolean isSmart() {
        return isSmart;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isKabelTV() {
        return kabelTV;
    }
}
