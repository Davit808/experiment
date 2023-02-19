package function.OOP;

public class Main {
    public static void main(String[] args) {
        Building b1 = new Building(3, new int[]{1, 2, 3, 5, 6, 7, 9, 10, 11}, new int[]{4, 8, 12}, "panel");
        Building b2 = new Building(5, new int[]{2, 3, 5, 6, 8, 9, 11, 12, 14, 15}, new int[]{1, 4, 7, 10, 13}, "monolithic");
        Building b3 = b1;
        Building b4 = b2;

        District Center = new District(new Building[]{b1, b2, b3, b4}, 1000);
        System.out.println(Center.getResult());
        System.out.println();
        Sportsman s1 = new Sportsman("John Dou - 1", new int[]{78, 65, 93, 98, 42, 120});
        Sportsman s2 = new Sportsman("John Dou - 2", new int[]{58, 33, 80, 123, 32, 94, 78});
        Sportsman s3 = new Sportsman("John Dou - 3", new int[]{65, 32, 100, 70});
        Sportsman s4 = new Sportsman("John Dou - 4", new int[]{93, 33, 87, 123, 100, 96, 78});

        System.out.println(s1.resultThisAndAnotherSportsman(s2));
        System.out.println(s2.resultThisAndAnotherSportsman(s1));
        System.out.println(s3.resultThisAndAnotherSportsman(s2));
        System.out.println();
        System.out.println(greatestCommonDivisor(s1.getCompetitionResults()));
        System.out.println(greatestCommonDivisor(s2.getCompetitionResults()));
        System.out.println(greatestCommonDivisor(s3.getCompetitionResults()));
        System.out.println(greatestCommonDivisor(s4.getCompetitionResults()));

    }

    static int greatestCommonDivisor(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) {
                x = arr[i];
            }
        }
        int result = 1;
        for (int i = 2; i <= x; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0) {
                    break;
                } else if (j == arr.length - 1) {
                    result = i;
                }
            }
        }
        return result;
    }
}
