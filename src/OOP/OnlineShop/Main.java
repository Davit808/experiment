package OOP.OnlineShop;

import OOP.Expands.BankCard;
import OOP.Expands.BusinessCard;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Phone","Samsung", "A-51", 102000, 150000, 2);
        Electronics phone2 = new Phone("Phone","Iphone", "6s", 48000, 100000, 1);
        TV tv1 = new TV("TV", "Sharp", "AK-74", 47000, 75000, false);
        Electronics tv2 = new TV("TV","Samsung", "ABC", 135000.65, 185020, true);
        Tablet tablet1 = new Tablet("Tablet","Iphone", "IP-1", 125000, 150000, 2, 11);
        Electronics tablet2 = new Tablet("Tablet","Nokia", "NK-1", 87000, 96000, 1, 8);
        Laptop laptop1 = new Laptop("Laptop", "Panasonic", "PC-1", 179560, 203650, 16);
        Electronics laptop2 = new Laptop("Laptop", "HP", "HP-001", 235000, 287000, 32);
        Headphones hp1 = new Headphones("Headphones", "HP", "hp-001", 1500, 2200, true);
        Electronics hp2 = new Headphones("Headphones", "IP", "IP-002", 3200, 4500, 1.5);

        ElectronicsStore shop = new ElectronicsStore(new Electronics[] {phone1, phone2, tv1, tv2, laptop2, tablet1, tablet2, hp1, hp2}, "Davit808");

        BankCard bc1 = new BusinessCard("Davit", "Arzumanyan", "HH, Syuniq", 5, 2026);
//        LoyalCustomerCard lc1 = new LoyalCustomerCard("Davit", "Arzumanyan");
//        LoyalCustomerCard lc2 = new LoyalCustomerCard("Aram", "Aramyan");
//        shop.LookAtTheProducts("Davit808");
//        System.out.println("------------------------");
//        shop.LookAtTheProducts();
//        System.out.println("------------------------");

        shop.income("Davit808");
        System.out.println("------------------------");
        shop.LookAtTheProducts();
        System.out.println("------------------------");
        shop.LookAtTheProducts("Davit808");
        System.out.println("------------------------");
        shop.income("Davit808");
        System.out.println("------------------------");
        shop.lookThisProduct("Phone");
        System.out.println("------------------------");
        shop.payment(bc1, phone2);
        shop.income("Davit808");
        shop.payment(150000, phone1);
        shop.inputInStore(phone2);
        System.out.println("------------------------");
        shop.LookAtTheProducts("Davit808");
        System.out.println("------------------------");
        shop.lookThisProduct("Phone");
        System.out.println("------------------------");
        shop.income("Davit808");

    }
}
