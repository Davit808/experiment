package OOP.Expands;

public class Main {
    public static void main(String[] args) {
        StandardCard s1 = new StandardCard("Aram", "Aramyan", "HH, Syuniq, Goris", 2, 2026);
        GoldCard g1 = new GoldCard("Poxos", "Poxosyan", "HH, Erevan", 5, 2025);
        BusinessCard b1 = new BusinessCard("John", "Doe", "USA, New York", 1, 2028);
        s1.sout();
        g1.sout();
        b1.sout();
    }
}
