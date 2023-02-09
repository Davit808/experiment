package function.OOP;

public class City {
    String names;
    double square;
    int population;

    City(String n, double s, int p) {
        names = n;
        if (names.length() == 0) {
            names = "Not defined";
        }
        square = s;
        population = p;
    }

    public static void main(String[] args) {
        City city1 = new City("", 36000, 20500);
//        city1.names = "Goris";
        System.out.print(city1.names + "\n" + city1.population + "\n" + city1.square);
    }
}

