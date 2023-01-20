package javaStart;

public class moduleArray {
    public static void main(String[] args) {
        int[] array = {-6, 2, 11, 6, -21, 9};
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -1 * array[i];
                x++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Negative is " + x);
        System.out.println("Positive is " + (array.length - x));
    }
}
