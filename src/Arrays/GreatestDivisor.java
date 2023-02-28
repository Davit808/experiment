package Arrays;

public class GreatestDivisor {
    public static void main(String[] args) {

    }
    static int greatestCommonDivisor(int[] arr) {
        int x;
        if (arr[0] > 0) {
            x = arr[0];
        } else x = arr[0] * -1;
        for (int i = 1; i < arr.length; i++) {
            int moduleArrValue;
            if (arr[i] < 0) {
                moduleArrValue = arr[i] * -1;
            } else {
                moduleArrValue = arr[i];
            }
            if (x > moduleArrValue) {
                x = moduleArrValue;
            }
        }
        int result = 1;
        int theSmallestDivisor;
        if (x % 2 == 0) {
            theSmallestDivisor = 2;
        } else {
            theSmallestDivisor = 1;
        }
        for (int i = theSmallestDivisor; i <= x; i += 2) {
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
