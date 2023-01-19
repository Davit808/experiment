package Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {6, 21, 3, 34, 5, 7};
        boolean count = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j <= arr[i] / 2 + 1; j++) {
                if (arr[i] % j == 0) {
                    break;
                } else if (j > arr[i] / 2) {
                    System.out.print(arr[i] + " ");
                    count = true;
                }
            }
        }
        if (count == false) {
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

