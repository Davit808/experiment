package function.OOP;

public class sportsman {
    String name;
    int result;
    sportsman(String n,int...p) {
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
        sportsman human1 = new sportsman("Muhammad Ali", 99, 98, 95, 100, 95, 50);
        sportsman human2 = new sportsman("Mike Tyson", 95, 97, 90, 98, 98, 90);
        sportsman human3 = new sportsman("Roy Jones", 85, 88, 95, 99, 90);
        int[] sportsmanResult = {human1.result, human2.result, human3.result};
        for (int a : sportsmanResult) {
            System.out.print(a + " ");
        }
    }
}
