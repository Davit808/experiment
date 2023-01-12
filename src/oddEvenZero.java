public class oddEvenZero {
    public static void main(String[] args) {
        double[] first = {7, 3, 1, -2, 8, 22, 13, -1};
        double[] second = {4, 1, -6, 3, -5, -64, 1, -9};
        double[] newArray = new double[first.length];

        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0 && second[i] % 2 != 0) {
                newArray[i] = first[i];
            } else if (first[i] % 2 == 0 && second[i] % 2 == 0) {
                newArray[i] = second[i];
            } else {
                newArray[i] = 0;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print((int) newArray[i] + " ");
        }
    }
}
