package Arrays;

public class twoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("\nPrint first and last number in array");
        int[][] arr = {
                {0, 11, 23, 34, 47, 51},
                {2, 13, 25, 37, 42, 59},
                {4, 15, 29, 34, 43, 57}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j += arr[i].length - 1) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPrint the longest array");

        int[][] arr2 = {
                {2, 13, 25, 38, 50},
                {5, 11, 23},
                {4, 15, 29, 34, 43, 57},
                {2, 13, 25, 50},
        };
        byte k = 0; // if length arr2 small 127, else k is short, int ...
        for (byte i = 1; i < arr2.length; i++) {
            if (arr2[i].length > arr2[k].length) {
                k = i;
            }
        }
        for (int i = 0; i < arr2[k].length; i++) {
            System.out.print(arr2[k][i] + " ");
        }

        System.out.println("\n\nPrint the amount of numbers which are bigger from previous in the array");

        int[] arr3 = {4, 12, 8, 7, 32, 87, 64};
        int n = 0;
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] > arr3[i - 1]) {
                n++;
            }
        }
        System.out.println(n);
    }
}
