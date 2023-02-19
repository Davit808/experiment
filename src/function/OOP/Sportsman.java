package function.OOP;

public class Sportsman {
    private String name;
    private int[] competitionResults;
    private int result;

    Sportsman(String n, int... CR) {
        name = n;
        for (int i = 0; i < CR.length; i++) {
            if (CR[i] < 50) {
                CR[i] = 50;
            } else if (CR[i] > 100) {
                CR[i] = 100;
            }
        }
        competitionResults = CR;
        result = result();
    }

    public int[] getCompetitionResults() {
        return competitionResults;
    }

    private int result() {
        int sum = 0;
        for (int i = 0; i < competitionResults.length; i++) {
            sum += competitionResults[i];
        }
        return sum / competitionResults.length;
    }

    public int getResult() {
        return result;
    }

    int resultThisAndAnotherSportsman(Sportsman anotherSportsmanResult) {
        if (this.result > anotherSportsmanResult.result) {
            return 1;
        } else if (this.result < anotherSportsmanResult.result) {
            return -1;
        }
        return 0;
    }
}
