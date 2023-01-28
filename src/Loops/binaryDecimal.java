package Loops;

public class binaryDecimal {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1, 1, 1, 1, 0, 1, 0, 1, 1, 1};
        int sum = 0;
        for (int i = 0, degree = arr.length-1, indexDegreeValue = 1; i < arr.length; i++) {
            for (int j = degree; j > 0 ; j--) {
                indexDegreeValue = indexDegreeValue * 2;
            }
            sum = sum + arr[i] * indexDegreeValue;
            indexDegreeValue = 1;
            degree--;
        }
        System.out.println(sum);
    }
}
