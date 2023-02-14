package function;

import java.util.Scanner;

public class PrintThePowerOfNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter the valid numbers a for 1..10 and b for -10..10");
        int a = numbers.nextInt();
        int b = numbers.nextInt();
        if (printThePowerOfNumbers(a, b) < 0) {
            switch ((int) printThePowerOfNumbers(a, b)) {
                case -1 -> System.out.println("Enter the correct number for a 1-10 and for b -10 .. 10");
                case -2 -> System.out.println("Enter the correct number for a 1 .. 10");
            }
        } else if (printThePowerOfNumbers(a, b) < 1) {
            System.out.printf("%." + b * -1 + "f\n", printThePowerOfNumbers(a, b));
        } else {
            System.out.println((long) printThePowerOfNumbers(a, b));
        }
    }

    static double printThePowerOfNumbers(int a, int b) {
        if (abc(a) > 10 || abc(b) > 10) {
            return -1;
        } else if (a < 1) {
            return -2;
        }
        double power;
        if (b < 0) {
            b = b * -1;
            power = 1 / returnThePowerNumber(a, b);
            return power;
        }
        power = returnThePowerNumber(a, b);
        return power;
    }

    static double returnThePowerNumber(int a, int b) {
        double power = 1;
        while (b > 0) {
            power = power * a;
            b--;
        }
        return power;
    }

    static int abc(int... a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = -1 * a[i];
            }
            return a[i];
        }
        return 808;
    }
}
