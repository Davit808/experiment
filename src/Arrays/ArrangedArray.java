package Arrays;

public class ArrangedArray {
    public static void main(String[] args) {
        int[] array4 = {-23, 5, -23, 12, -23, 12, 5, 12, 5, 12, -23, 5, 12, -23, 12};
        for (int i = 0, j = 0, k = array4.length - 1; i < array4.length; ) {
            int x = array4[i];
            if (array4[i] == -23) {
                    array4[i] = array4[j];
                    array4[j] = x;
                    j++;
                    i = j;
            } else if (array4[i] == 12) {
                for (int l = k; l >= i; l--) {
                    if (array4[k] != 12) {
                        array4[i] = array4[k];
                        array4[k] = x;
                        k--;
                        break;
                    } else {
                        k--;
                    }
                }
            } else {
                i++;
                continue;
            }
            if (i > k) {
                break;
            }
        }

        for (int i : array4) {
            System.out.print(i + " ");
        }
    }

}
