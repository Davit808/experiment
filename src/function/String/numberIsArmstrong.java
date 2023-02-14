package function.String;

public class numberIsArmstrong {
    public static void main(String[] args) {
        int number = 5488346;
        System.out.println(result(number));
    }

    static boolean result(int number) {
        boolean result = true;
        int degree = lengthOfNumber(number);
        int index = degreeOfIndexForNumber(10, degree - 1);
        int valueForCompare = number;
        int totalSum = 0;
        for (int i = degree, valueDegree; i > 0; i--) {
            int a = number / index;
            valueDegree = degreeOfIndexForNumber(a, degree);
            totalSum += valueDegree;
            number = number - a * index;
            index = index / 10;
        }
        if (totalSum != valueForCompare) {
            return false;
        }
        return result;
    }

    static int degreeOfIndexForNumber(int number, int degree) {
        int totalSum = 1;
        for (int sum = number; degree > 0; degree--) {
            totalSum *= sum;
        }
        return totalSum;
    }

    static int lengthOfNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i *= 10) {
            sum++;
        }
        return sum;
    }
}
