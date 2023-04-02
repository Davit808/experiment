package OOP.OnlineShop;

public class Laptop extends Electronics{
    private int randomAccessMemory = 8;

    public Laptop(String type, String companyName, String modelName, double costPrice, double salePrice, int randomAccessMemory) {
        super(type, companyName, modelName, costPrice, salePrice);
        if (randomAccessMemory >= 8 && randomAccessMemory <=32) {
            this.randomAccessMemory = randomAccessMemory;
        }
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }
}
