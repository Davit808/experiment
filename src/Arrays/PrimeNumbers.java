package Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {0, 5, 6, 21, 0, 7, 3, 13, 34};

        for (int i = 0; i < arr.length; i++) {
            boolean count = true;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    count = false;
                }
            }
            if (count != false && arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
