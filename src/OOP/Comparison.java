package OOP;

public class Comparison {
    private int compareTheResults;
    private int resultOfSportsman1;
    private int resultOfSportsman2;

    Comparison(int sportsman1, int sportsman2) {
        resultOfSportsman1 = sportsman1;
        resultOfSportsman2 = sportsman2;
    }

    public int getCompareTheResults() {
        if (resultOfSportsman1 > resultOfSportsman2) {
            return compareTheResults = 1;
        } else if (resultOfSportsman1 < resultOfSportsman2) {
            return compareTheResults = -1;
        }
        return compareTheResults = 0;
    }
}
