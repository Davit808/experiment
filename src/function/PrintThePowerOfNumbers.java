package function;

import java.util.Scanner;

public class PrintThePowerOfNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter the valid numbers a for 1..10 and b for -10..10");
        int a = numbers.nextInt();
        int b = numbers.nextInt();
        double result = printThePowerOfNumbers(a, b);
        if (result < 0) {
            switch ((int) result) {
                case -1 -> System.out.println("Enter the correct number for a 1-10 and for b -10 .. 10");
                case -2 -> System.out.println("Enter the correct number for a 1 .. 10");
            }
        } else if (result < 1) {
            System.out.printf("%." + b * -1 + "f\n", result);
        } else {
            System.out.println((long) result);
        }
    }

    public static double printThePowerOfNumbers(int a, int b) {
        if (a < 1 && a > -11) {
            return -2;
        } else if (a > 10 || b > 10 || a < -10 || b < -10) {
            return -1;
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

    public static double returnThePowerNumber(int a, int b) {
        double power = 1;
        while (b > 0) {
            power = power * a;
            b--;
        }
        return power;
    }
}
