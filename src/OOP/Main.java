package OOP;

public class Main {
    public static void main(String[] args) {
//        Building b1 = new Building(3, new int[]{1, 2, 3, 5, 6, 7, 9, 10, 11}, new int[]{4, 8, 12}, "panel");
//        Building b2 = new Building(5, new int[]{2, 3, 5, 6, 8, 9, 11, 12, 14, 15}, new int[]{1, 4, 7, 10, 13}, "monolithic");
//        Building b3 = b1;
//        Building b4 = b2;
//
//        District Center = new District(new Building[]{b1, b2, b3, b4}, 1000);
//        String resultOfArea = String.format("Value of area for each house is %5.3f", Center.getResult());
//        System.out.println(resultOfArea);
//        System.out.println(Center.getResult());
//        Sportsman s1 = new Sportsman("John Dou - 1", new int[]{78, 65, 93, 98, 42, 120});
//        Sportsman s2 = new Sportsman("John Dou - 2", new int[]{58, 33, 80, 123, 32, 94, 78});
//        Sportsman s3 = new Sportsman("John Dou - 3", new int[]{65, 32, 100, 70});
//        Sportsman s4 = new Sportsman("John Dou - 4", new int[]{93, 33, 87, 123, 100, 96, 78});
//
//        System.out.println(s1.resultThisAndAnotherSportsman(s2));
//        System.out.println(s2.resultThisAndAnotherSportsman(s1));
//        System.out.println(s3.resultThisAndAnotherSportsman(s2));
//        System.out.println();
//        int[] array1 = {93, 33, 87, 123, 100, 96, 78};
//        int[] array2 = {-50, 120, 100, -45, 75};
//        int[] array3 = {-52, 120, 98, -46, 88};
//        System.out.println(greatestCommonDivisor(array1));
//        System.out.println(greatestCommonDivisor(array2));
//        System.out.println(greatestCommonDivisor(array3));


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

//    static int greatestCommonDivisor(int[] arr) {
//        int x;
//        if (arr[0] > 0) {
//            x = arr[0];
//        } else x = arr[0] * -1;
//        for (int i = 1; i < arr.length; i++) {
//            int moduleArrValue;
//            if (arr[i] < 0) {
//                moduleArrValue = arr[i] * -1;
//            } else {
//                moduleArrValue = arr[i];
//            }
//            if (x > moduleArrValue) {
//                x = moduleArrValue;
//            }
//        }
//        int result = 1;
//        int theSmallestDivisor;
//        if (x % 2 == 0) {
//            theSmallestDivisor = 2;
//        } else {
//            theSmallestDivisor = 1;
//        }
//        for (int i = theSmallestDivisor; i <= x; i += 2) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] % i != 0) {
//                    break;
//                } else if (j == arr.length - 1) {
//                    result = i;
//                }
//            }
//        }
//        return result;
//    }
}
