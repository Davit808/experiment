package function.OOP;

public class Sportsman {
    String name;
    int result;
    Sportsman(String n, int...p) {
       name = n;
        int[] points = p;
        result = resultTotalPoints(points);
    }
     int resultTotalPoints(int[] arr) {
        int sum = 0;
        int timer = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            timer++;
        }
        return sum / timer;
    }

    public static void main(String[] args) {
        Sportsman human1 = new Sportsman("Muhammad Ali", 99, 98, 95, 100, 95, 50);
        Sportsman human2 = new Sportsman("Mike Tyson", 95, 97, 90, 98, 98, 90);
        Sportsman human3 = new Sportsman("Roy Jones", 85, 88, 95, 99, 90);
        int[] sportsmanResult = {human1.result, human2.result, human3.result};
        for (int a : sportsmanResult) {
            System.out.print(a + " ");
        }
    }
}
