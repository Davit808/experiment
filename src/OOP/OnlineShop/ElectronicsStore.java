package OOP.OnlineShop;

import OOP.Expands.BankCard;

public class ElectronicsStore implements WiFi{
    private Electronics[] warehouse;
    private String managerPassword;
    private double income;
    private Electronics[] discountForFivePercent;
    private Electronics[] discountForTenPercent;
    private LoyalCustomerCard[] loyalCustomerCards = new LoyalCustomerCard[100];

    public ElectronicsStore(Electronics[] warehouse, String managerPassword) {

        this.warehouse = warehouse;

        this.managerPassword = managerPassword;
    }

    private double totalExpense() {
        double totalCost = 0;
        for (int i = 0; i < warehouse.length; i++) {
            totalCost += warehouse[i].getCostPrice();
        }
        return totalCost;
    }

    public void addInFivePercentDiscount(Electronics...electronics){
        for (int i = 0; i < this.discountForFivePercent.length; i++) {
            if (discountForFivePercent[i] == null){
                for (int j = 0; j < electronics.length; j++) {
                    if (electronics[j] != null){
                        discountForFivePercent[i] = electronics[j];
                        electronics[j] = null;
                        break;
                    }
                }
            }
        }

    }
    public void payment(BankCard bankCard, Electronics electronics, LoyalCustomerCard loyalCustomer) {
        for (int i = 0; i < warehouse.length; i++) {
            if (warehouse[i] == electronics) {
                if (bankCard.getSumOfAccount() >= electronics.getSalePrice()) {
                    this.income += (electronics.getSalePrice() - electronics.getCostPrice());
                    bankCard.setOnlinePayment((int) electronics.getSalePrice());
                    outputInStore(electronics);
                    for (int j = 0; j < this.loyalCustomerCards.length; j++) {
                        if (this.loyalCustomerCards[j].getNumberCard() == loyalCustomer.getNumberCard()) {
                            this.loyalCustomerCards[j].Points(electronics.getSalePrice());
                            break;
                        }
                    }
                } else if (bankCard.getSumOfAccount() < electronics.getSalePrice()) {
                    System.out.println("Insufficient funds");
                }
            }
        }
    }

    public void payment(BankCard bankCard, Electronics electronics) {
        for (int i = 0; i < warehouse.length; i++) {
            if (warehouse[i] == electronics) {
                if (bankCard.getSumOfAccount() >= electronics.getSalePrice()) {
                    this.income += (electronics.getSalePrice() - electronics.getCostPrice());
                    bankCard.setOnlinePayment((int) electronics.getSalePrice());
                    outputInStore(electronics);
                } else if (bankCard.getSumOfAccount() < electronics.getSalePrice()) {
                    System.out.println("Insufficient funds");
                }
            }
        }
    }

    public void payment(int money, Electronics electronics, LoyalCustomerCard loyalCustomer) {
        for (int i = 0; i < warehouse.length; i++) {
            if (warehouse[i] == electronics) {
                if (money >= electronics.getSalePrice()) {
                    this.income += (electronics.getSalePrice() - electronics.getCostPrice());
                    outputInStore(electronics);
                    for (int j = 0; j < this.loyalCustomerCards.length; j++) {
                        if (this.loyalCustomerCards[j].getNumberCard() == loyalCustomer.getNumberCard()) {
                            this.loyalCustomerCards[j].Points(electronics.getSalePrice());
                            break;
                        }
                    }
                } else if (money < electronics.getSalePrice()) {
                    System.out.println("Insufficient funds");
                }
            }
        }
    }

    public void payment(int money, Electronics electronics) {
        for (int i = 0; i < warehouse.length; i++) {
            if (warehouse[i] == electronics) {
                if (money >= electronics.getSalePrice()) {
                    this.income += (electronics.getSalePrice() - electronics.getCostPrice());
                    outputInStore(electronics);
                } else if (money < electronics.getSalePrice()) {
                    System.out.println("Insufficient funds");
                }
            }
        }
    }

    private void outputInStore(Electronics electronics) {
        for (int i = 0; i < warehouse.length; i++) {
            if (warehouse[i] == electronics) {
                warehouse[i] = null;
            }
        }
    }

    public void inputInStore(Electronics electronics) {
        for (int i = 0; i < warehouse.length; i++) {
            if (warehouse[i] == null) {
                warehouse[i] = electronics;
                break;
            }
        }
    }

    public void lookThisProduct(String type) {
        for (int i = 0; i < warehouse.length; i++) {
            if (warehouse[i] == null) {
                continue;
            } else if (warehouse[i].getType() == type || warehouse[i].getModelName() == type) {
                System.out.println(warehouse[i].getType() + " " + warehouse[i].getCompanyName() + " " + warehouse[i].getModelName() + " " + warehouse[i].getSalePrice());
            }
        }
    }

    public void LookAtTheProducts() {
        for (int i = 0; i < warehouse.length; i++) {
            if (warehouse[i] == null) {
                continue;
            }
            System.out.println(warehouse[i].getType() + " " + warehouse[i].getCompanyName() + " " + warehouse[i].getModelName() + " " + warehouse[i].getSalePrice());
        }
    }


    public void LookAtTheProducts(String password) {
        int countTotalProducts = 0;
        if (password == managerPassword) {
            for (int i = 0; i < warehouse.length; i++) {
                if (warehouse[i] == null) {
                    continue;
                }
                System.out.println(warehouse[i].getType() + " " + warehouse[i].getCompanyName() + " " + warehouse[i].getModelName() + " " + warehouse[i].getSalePrice() + " " + warehouse[i].getCostPrice());
                countTotalProducts++;
            }
            System.out.println("Total products in the store - " + countTotalProducts);
        } else {
            System.out.println("Bad password");
        }
    }

    public void income(String password) {
        if (password == managerPassword) {
            System.out.println(income);
        } else {
            System.out.println("You cant seeing this info");
        }
    }

    public void setLoyalCustomerCards(LoyalCustomerCard loyalCustomerCards, String password) {
        if (password == managerPassword) {
            for (int i = 0; i < this.loyalCustomerCards.length; i++) {
                if (this.loyalCustomerCards[i] == null) {
                    this.loyalCustomerCards[i] = loyalCustomerCards;
                    break;
                }
            }
        }
    }

    public void deleteLoyalCustomerCard(LoyalCustomerCard loyalCustomerCard, String password) {
        if (password == managerPassword) {
            for (int i = 0; i < this.loyalCustomerCards.length; i++) {
                if (this.loyalCustomerCards[i] == loyalCustomerCard) {
                    this.loyalCustomerCards[i] = null;
                }
            }
        }
    }

    private int discountAmount(Electronics electronics) {
        int percent = 95;
        for (int i = percent; i >= 50; i -= 5) {
            if (electronics.getSalePrice() / (100 - percent) > electronics.getSalePrice() - electronics.getCostPrice()) {
                continue;
            }
        }
        return percent;
    }

    @Override
    public void wifi(){};
}
