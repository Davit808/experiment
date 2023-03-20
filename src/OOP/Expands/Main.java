package OOP.Expands;

public class Main {
    public static void main(String[] args) {
        StandardCard sc1 = new StandardCard("Davit", "Arzumanyan", "HH, Syuniq", 10000000);
        GoldCard gc1 = new GoldCard("Davit", "Arzumanyan", "HH, Syuniq", 100000000);
        System.out.println(gc1.getAllowanceForLaunch());
        gc1.setOutputForLaunch(2000);
        System.out.println(gc1.getAllowanceForLaunch());
        System.out.println(gc1.getSumOfAccount());
        gc1.setExitSum(100000);
        System.out.println(gc1.getSumOfAccount());
        BusinessCard bc1 = new BusinessCard("Davit", "Arzumanyan", "HH, Syuniq", 100000000);
        bc1.setCreditSum(true);
        System.out.println(bc1.getCreditSum());
        bc1.setCreditSum(true);
        System.out.println(bc1.getCreditSum());
    }
}
