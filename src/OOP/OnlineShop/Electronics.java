package OOP.OnlineShop;

public  abstract class Electronics {
    private String type;
    private String companyName;
    private String modelName;
    private double costPrice;
    private double salePrice;
    public Electronics(String type, String companyName, String modelName, double costPrice, double salePrice) {
        this.type = type;
        this.companyName = companyName;
        this.modelName = modelName;
        setCostPrice(costPrice);
        setSalePrice(salePrice);
    }

    public void setCostPrice(double costPrice) {
        if(costPrice > 0){
            this.costPrice = costPrice;
        } else {
            System.out.println("Incorrect sum of cost price");
            System.exit(1);
        }
    }

    public void setSalePrice(double salePrice) {
        if(salePrice > costPrice){
            this.salePrice = salePrice;
        } else {
            System.out.println("Incorrect sum of sale price");
            System.exit(1);
        }
    }

    public String getType() {
        return type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getModelName() {
        return modelName;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

}
