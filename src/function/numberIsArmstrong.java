package function;

public class numberIsArmstrong {
    public static void main(String[] args) {
        int number = 15;
        int degree = lengthOfNumber(number); // 3
        int index = degreeOfIndexForNumber(10, degree - 1); //100
        System.out.println(result(number, index, degree));
    }

    static boolean result(int number, int index, int degree) {
        boolean result = true;
        int compare = number;
        int totalSum = 0;
        for (int i = degree, sum; i > 0; i--) {
            int a = number / index;
            do {
                sum = degreeOfIndexForNumber(a, degree);
            } while (false);
            totalSum += sum;
            number = number - a * index;
            index = index / 10;
        }
        if (totalSum != compare) {
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
        for (int i = 1; number / i > 0; i *= 10) {
            sum++;
            continue;
        }
        return sum;
    }
}
