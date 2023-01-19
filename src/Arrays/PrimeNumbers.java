package Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 34, 5, 7};
        byte count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count = 1;
                System.out.print(arr[i] + " ");
            }
        }
        if (count == 0) {
            System.out.println("This array isn't having a prime numbers");
        }
    }
}

//        for (int i = 0; i < arr.length; i++) {
//            boolean count = true;
//            for (int j = 2; j <= arr[i] / 2; j++) {
//                if (arr[i] % j == 0) {
//                    count = false;
//                }
//            }
//            if (count1 != false && arr[i] != 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }

