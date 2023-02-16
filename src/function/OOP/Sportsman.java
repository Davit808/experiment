package function.OOP;

public class Sportsman {
    private String name;
    private int numberOfLength;
    private int[] allPointsForSportsman = new int[numberOfLength];
    private int result;

    Sportsman(String n, int... p) {
        name = n;
        setNumberOfLength(p.length);
        int[] allPoints = new int[numberOfLength];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[j] < 50) {
                    allPoints[j] = 50;
                } else if (p[j] > 100) {
                    allPoints[j] = 100;
                } else {
                    allPoints[j] = p[j];
                }
            }
        }
        allPointsForSportsman = allPoints;
        result = resultTotalPoints();
    }

    private int resultTotalPoints() {
        int sum = 0;
        for (int i = 0; i < allPointsForSportsman.length; i++) {
            sum += allPointsForSportsman[i];
        }
        return sum / allPointsForSportsman.length;
    }

    public void setNumberOfLength(int x) {
        if (x < 6) {
            this.numberOfLength = 6;
        }
        this.numberOfLength = x;
    }

    public int getResult() {
        return result;
    }
}
