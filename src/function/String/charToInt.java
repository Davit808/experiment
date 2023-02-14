package function.String;

public class charToInt {
    static int[] charArrayToIntArray(char[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    static char[] intArrayToCharArray(int[] array) {
        char[] arr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = (char) array[i];
        }
        return arr;
    }

    static boolean compareTwoArrays(char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd', '#', '&'};
        int[] arr2 = charArrayToIntArray(arr1);
        char[] arr3 = intArrayToCharArray(arr2);
//        arr3[2] = 'n';
        System.out.println("Result of arr1 and arr3 are " + compareTwoArrays(arr1, arr3));
    }
}
