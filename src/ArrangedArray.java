public class ArrangedArray {
    public static void main(String[] args) {
        int[] array4 = {5, -23, 12, 5, 12, -23, 5, -23};
        for (int i = 0, j = 0, k = array4.length - 1; i < array4.length; i++) {
            int x = array4[i];
            int y;
            if (array4[i] == -23) {
                for (int l = j; l <= i; l = j) {
                    if (array4[l] != -23){
                        y = array4[j];
                        array4[j] = x;
                        array4[i] = y;
                        j++;
                        break;
                    } else {
                        j++;
                    }
                }
            } else if (array4[i] == 12) {
                for (int l = k; l >= i ; l--) {
                    if (array4[k] != 12){
                        y = array4[k];
                        array4[k] = x;
                        array4[i] = y;
                        k--;
                        break;
                    }else {
                        k--;
                    }
                }
            }
            if ( i > k){
                break;
            }
        }

        for (int i : array4) {
            System.out.print(i + " ");
        }
    }

}
}
